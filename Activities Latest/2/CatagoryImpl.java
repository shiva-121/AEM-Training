package com.adobe.ase.aem.training.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.Catagory;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {Catagory.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CatagoryImpl implements Catagory{
	@SlingObject
	Resource resource;
	
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String name;
	
	@ValueMapValue
	public String description;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return description;
	}

}
