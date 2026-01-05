package com.adobe.ase.aem.training.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(
		name = "Adobe AEM Database Configuration",
		description = "This configuration reads the value to make database call"
	)

public @interface DatabaseConfiguration {
	@AttributeDefinition(
			name = "URL",
			description="Enter the URL"
			)
	public String getUrl();
	@AttributeDefinition(
			name = "Port Number",
			description = "Enter the port no."
			)
	public String getPort();
	   @AttributeDefinition
	   (
			   name= "Protocol",
			   description="choose protocol",
			   options = {
					   @Option(label="HTTP",value="http"),
					   @Option(label = "HTTPS", value= "https")
			           }
	   )
	   
	   public String getProtocol();
	   
	   @AttributeDefinition(
			   name="Enable config",
			   description="configuration is enabled or not",
			   type=AttributeType.BOOLEAN
			   )
	   public boolean getConfig();
}
	
