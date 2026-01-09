package com.adobe.ase.aem.training.core.models.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.ase.aem.training.core.models.CompositeMultifieldInterface;
import com.adobe.ase.aem.training.core.models.ComponentInterface;
import com.adobe.cq.export.json.ComponentExporter;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {ComponentInterface.class, ComponentExporter.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
resourceType = "/apps/ase/components/path-to-component")
	
public class ComponentInterfaceIMPL implements ComponentInterface{
	
	@ChildResource(name="fieldName")
	public List<CompositeMultifieldInterface> fieldName;

	@Override
	public List<CompositeMultifieldInterface> getCompositeMultifield() {
		// TODO Auto-generated method stub
		return fieldName;
	}

}
