package com.adobe.ase.aem.training.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.AddUniversity;
@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {AddUniversity.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AddUniversityImpl implements AddUniversity{
	@SlingObject
	Resource resource;
	
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String name;
	@ValueMapValue
	public String location;
	@ValueMapValue
	public String type;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}


}
