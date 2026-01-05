package com.adobe.ase.aem.training.core.models.impl;

import org.apache.sling.api.resource.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.Project;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
		adapters = {Project.class},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Projectimpl implements Project{

	@SlingObject
	Resource resource;
	
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String pname;
	
	@ValueMapValue
	public String pcode;
	
	@Override
	public String getpname() {
		return pname;
	}

	@Override
	public String getpcode() {
		return pcode;
	}
	
}
