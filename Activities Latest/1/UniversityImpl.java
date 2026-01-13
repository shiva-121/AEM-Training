package com.adobe.ase.aem.training.core.models.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.AddUniversity;
import com.adobe.ase.aem.training.core.models.University;
import com.adobe.cq.export.json.ComponentExporter;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {University.class, ComponentExporter.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
resourceType = "/apps/ase/components/sample/university")
public class UniversityImpl implements University{
	
	@ChildResource(name="addUniversity")
	public List<AddUniversity> addUniversity;
	

	@Override
	public List<AddUniversity> getaddUniversity() {
		// TODO Auto-generated method stub
		return addUniversity;
	}

}
