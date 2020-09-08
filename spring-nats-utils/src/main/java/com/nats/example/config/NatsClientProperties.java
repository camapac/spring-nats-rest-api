package com.nats.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("nats.client")
public class NatsClientProperties {
	
	private NatsProperties natsProperties;

	public NatsProperties getNatsProperties() {
		return natsProperties;
	}
	
	public void setNatsProperties(NatsProperties natsProperties) {
		this.natsProperties = natsProperties;
	}

	public static class NatsProperties {

		private String urls;
		private Boolean isAnyc;
		public String getUrls() {
			return urls;
		}
		public void setUrls(String urls) {
			this.urls = urls;
		}
		public Boolean isAnyc() {
			return isAnyc;
		}
		public void setAnyc(Boolean isAnyc) {
			this.isAnyc = isAnyc;
		}
	
	}
}
