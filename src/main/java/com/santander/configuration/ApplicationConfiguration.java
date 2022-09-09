package com.santander.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ModelMapper modelMapper(){
	    return new ModelMapper();
	}
	
}
