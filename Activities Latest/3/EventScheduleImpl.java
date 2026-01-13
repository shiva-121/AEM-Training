package com.adobe.ase.aem.training.core.models.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.ase.aem.training.core.models.Event;
import com.adobe.ase.aem.training.core.models.EventSchedule;
import com.adobe.cq.export.json.ComponentExporter;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {EventSchedule.class, ComponentExporter.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
resourceType = "/apps/ase/components/sample/eventSchedule")
public class EventScheduleImpl implements EventSchedule{
	
	@ChildResource(name="event")
	public List<Event> event;
	
	@Override
	public List<Event> getEvent() {
		// TODO Auto-generated method stub
		return event;
	}
	
}
