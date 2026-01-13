package com.adobe.ase.aem.training.core.models.impl;

import java.util.Date;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.Session;
@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {Session.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SessionImpl implements Session{
	@SlingObject
	Resource resource;
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String title;
	@ValueMapValue
	public String speaker;
	@ValueMapValue
	public Date starttime;
	@ValueMapValue
	public Date endtime;

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getSpeaker() {
		// TODO Auto-generated method stub
		return speaker;
	}

	@Override
	public Date getStartTime() {
		// TODO Auto-generated method stub
		return starttime;
	}

	@Override
	public Date getEndTime() {
		// TODO Auto-generated method stub
		return endtime;
	}
	
}
