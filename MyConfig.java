package com.example.demo;

import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;

@Configuration
public class MyConfig {

	@Bean
	@Primary
	public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder)
	{
		ObjectMapper MAPPER = builder.createXmlMapper(false).build();
		MAPPER.registerSubtypes(new NamedType(MyRequestInfo1.class, "b"));
	    MAPPER.registerSubtypes(new NamedType(MyRequestInfo2.class, "c"));
	    return MAPPER;
	}
	
	/*
	 * @Bean public Validator validator() { return
	 * Validation.buildDefaultValidatorFactory().getValidator(); }
	 */
}
