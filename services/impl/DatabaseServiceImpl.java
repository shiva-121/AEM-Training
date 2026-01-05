package com.adobe.ase.aem.training.core.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import com.adobe.ase.aem.training.core.services.DatabaseConfiguration;
import com.adobe.ase.aem.training.core.services.DatabaseService;

@Component(service = DatabaseService.class, immediate = true, configurationPid = "aem.database.service")
@Designate(ocd=DatabaseConfiguration.class)			// ocd = object.class definition

public class DatabaseServiceImpl implements DatabaseService{
	
	private DatabaseConfiguration configuration;
	@Activate
	protected void activate(DatabaseConfiguration config) {
		// TODO Auto-generated method stub
		this.configuration = config;
	}
	@Override
	public String callDatabase() {
		String url = configuration.getUrl();
		String port = configuration.getPort();
		String protocol= configuration.getProtocol();
        boolean enableconfig= configuration.getConfig();
        return "URL is " + url + ",<br/>Port no is: " + port + "<br/>Protocol: " + protocol + "<br/>Config Enabled: " + enableconfig;

	}
	
}
