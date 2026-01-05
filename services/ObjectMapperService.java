package com.adobe.ase.aem.training.core.services;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The interface Object mapper service.
 *
 * @author xyz  This interface generates new Objectmapper Instance
 */
public interface ObjectMapperService {

	/**
	 * This method returns new ObjectMapper Instance
	 *
	 * @return ObjectMapper object mapper
	 */
	ObjectMapper getObjectMapper();


	/**
	 * Gets object mapper.
	 *
	 * @param config for the Fail for unknown properties
	 * @return the object mapper
	 */
	ObjectMapper getObjectMapper(boolean config);
}
