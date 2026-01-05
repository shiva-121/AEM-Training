package com.adobe.ase.aem.training.core.services.impl;

import org.osgi.service.component.annotations.Component;

import com.adobe.ase.aem.training.core.services.ObjectMapperService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;

/**
 * 
 * @author xyz
 * This service creates and returns new ObjectMapper Instance
 */
@Component(service = ObjectMapperService.class, immediate = true)
public class ObjectMapperServiceImpl implements ObjectMapperService {

	/**
	 * This method returns new ObjectMapper Instance
	 * @return ObjectMapper objectmapper
	 */
	@Override
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

	/**
	 * This method returns new ObjectMapper Instance
	 *
	 * @param config DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES set to false
	 * @return ObjectMapper objectmapper
	 */
	@Override
	public ObjectMapper getObjectMapper(boolean config) {
		return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, config);
	}
}
