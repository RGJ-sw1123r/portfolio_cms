package com.portfolio.cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.portfolio.cms.properties.CorsProperties;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final CorsProperties corsProperties;

    public WebMvcConfig(CorsProperties corsProperties) {
        this.corsProperties = corsProperties;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        for (CorsProperties.CorsMapping mapping : corsProperties.getMappings()) {
            registry.addMapping(mapping.getPath())
                .allowedOrigins(mapping.getOrigins().toArray(new String[0]))
                .allowedMethods(mapping.getMethods().toArray(new String[0]))
                .allowedHeaders(mapping.getHeaders().toArray(new String[0]))
                .allowCredentials(mapping.isAllowCredentials());
        }
    }
}
