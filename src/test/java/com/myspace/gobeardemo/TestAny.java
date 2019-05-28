package com.myspace.gobeardemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestAny {
	
	static public void main(String[] a) {
		Date firstDate = new Date(2019, 1, 12, 12, 40);
		Date secondDate = new Date(2019, 2, 12, 16, 0);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	    //Date firstDate = sdf.parse("06/24/2017");
	    //Date secondDate = sdf.parse("06/30/2017");
	 
	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    
		System.out.println("day diff = " + diff);
		
		int d = 30;
		double duration = Double.valueOf(d);
		double week = (duration-28) / 7;
		
		System.out.println("week = " + Math.ceil(week) );
		
	}
	
}
