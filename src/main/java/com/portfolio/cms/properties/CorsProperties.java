package com.portfolio.cms.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cors")
public class CorsProperties {
	
	private List<CorsMapping> mappings = new ArrayList<>();
	
	public List<CorsMapping> getMappings() {
	    return mappings;
	}
	
	public void setMappings(List<CorsMapping> mappings) {
	    this.mappings = mappings;
	}
	
	public static class CorsMapping {
		private String path;
		private List<String> origins;
		private List<String> methods;
		private List<String> headers;
		private boolean allowCredentials;
			
		// Getters and Setters
		public String getPath() { return path; }
		public void setPath(String path) { this.path = path; }
			
		public List<String> getOrigins() { return origins; }
		public void setOrigins(List<String> origins) { this.origins = origins; }
			
		public List<String> getMethods() { return methods; }
		public void setMethods(List<String> methods) { this.methods = methods; }
			
		public List<String> getHeaders() { return headers; }
		public void setHeaders(List<String> headers) { this.headers = headers; }
			
		public boolean isAllowCredentials() { return allowCredentials; }
		public void setAllowCredentials(boolean allowCredentials) { this.allowCredentials = allowCredentials; }
	}
	
}
