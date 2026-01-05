package com.adobe.ase.aem.training.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.MRecipe;


@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
		adapters = {MRecipe.class},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MRecipeImpl implements MRecipe{
	@SlingObject
	Resource resource;
	
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String rname;
	
	@ValueMapValue
	public int rprice;
	
	@ValueMapValue
	public String rimage;

	@Override
	public String getRname() {
		return rname;
	}

	@Override
	public int getRprice() {
		return rprice;
	}

	@Override
	public String getRimage() {
		return rimage;
	}
	
	

}
