package com.myspace.gobeardemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.kie.api.command.BatchExecutionCommand;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.KieServices;
import org.kie.api.runtime.ExecutionResults;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.KieServiceResponse.ResponseType;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;

public class TestDM {

	private static final String containerName = "gobear";
	private static final String sessionName = "myStatelessSession";
	
	static public void main(String[] arg) {
		
		try {
			// Define KIE services configuration and client:
			Set<Class<?>> allClasses = new HashSet<Class<?>>();
			allClasses.add(TravelInsuranceRequest.class);
			String serverUrl = "http://localhost:8080/kie-server/services/rest/server";
			String username = "rhdmAdmin";
			String password = "r3dh4t1!";
			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(serverUrl, username, password);
			config.setMarshallingFormat(MarshallingFormat.JAXB);
			config.addExtraClasses(allClasses);
			KieServicesClient kieServicesClient = KieServicesFactory.newKieServicesClient(config);

			// Set up the fact model:
			Date firstDate = new Date(2019, 1, 12, 12, 40);
			Date secondDate = new Date(2019, 2, 14, 16, 0);
			
			TravelInsuranceRequest iRequest = new TravelInsuranceRequest("Singapore", false, secondDate, firstDate);
			
			
			// Insert Person into the session:
			KieCommands kieCommands = KieServices.Factory.get().getCommands();
			List<Command> commandList = new ArrayList<Command>();
			commandList.add(kieCommands.newInsert(iRequest, "insuranceRequest"));

			// Fire all rules:
			commandList.add(kieCommands.newFireAllRules("numberOfFiredRules"));
			BatchExecutionCommand batch = kieCommands.newBatchExecution(commandList);

			// Use rule services client to send request:
			RuleServicesClient ruleClient = kieServicesClient.getServicesClient(RuleServicesClient.class);
			ServiceResponse<ExecutionResults> executeResponse = ruleClient.executeCommandsWithResults(containerName,
					batch);

			if (executeResponse.getType() == ResponseType.SUCCESS) {
				
				TravelInsuranceRequest r = (TravelInsuranceRequest) executeResponse.getResult().getValue("insuranceRequest");
				System.out.println("Result->Duration: " + r.getDuration());
				System.out.println("Result->Additional Week: " + r.getAdditionalWeek());
				System.out.println("Result->Additional Premium: " + r.getAdditionalPremium());
				System.out.println("Result->Standard Premium: " + r.getStandardPremium());
				System.out.println("Result->Total Premium: " + r.getTotalPremium());
			} else {
				System.out.println("Message:" + executeResponse.getMsg());
			}
		}

		catch (Throwable t) {
			t.printStackTrace();
		}

	}

}
