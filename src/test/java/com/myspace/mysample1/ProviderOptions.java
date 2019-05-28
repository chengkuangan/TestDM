package com.myspace.mysample1;

public class ProviderOptions {
	
	private java.lang.String provider;

	private java.lang.String api;

	public ProviderOptions() {
	}

	public java.lang.String getProvider() {
		return this.provider;
	}

	public void setProvider(java.lang.String provider) {
		this.provider = provider;
	}

	public java.lang.String getApi() {
		return this.api;
	}

	public void setApi(java.lang.String api) {
		this.api = api;
	}

	public ProviderOptions(java.lang.String provider, java.lang.String api) {
		this.provider = provider;
		this.api = api;
	}
}
