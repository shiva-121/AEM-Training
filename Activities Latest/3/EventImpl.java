package com.adobe.ase.aem.training.core.models.impl;

import java.util.Date;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.Event;
import com.adobe.ase.aem.training.core.models.Session;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {Event.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class EventImpl implements Event{
	@SlingObject
	Resource resource;
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String name;
	@ValueMapValue
	public Date date;
	@ValueMapValue
	public String venue;
	@ChildResource(name = "session")
	public List<Session> session;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return date;
	}
	
	@Override
	public String getVenue() {
		// TODO Auto-generated method stub
		return venue;
	}

	@Override
	public List<Session> getSession() {
		// TODO Auto-generated method stub
		return session;
	}

}
