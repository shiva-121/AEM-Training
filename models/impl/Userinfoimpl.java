package com.adobe.ase.aem.training.core.models.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.Project;
import com.adobe.ase.aem.training.core.models.UserInfo;
import com.adobe.cq.export.json.ComponentExporter;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
		adapters = {UserInfo.class, ComponentExporter.class},
		resourceType = "/apps/ase/components/sample/userinfo")
public class Userinfoimpl implements UserInfo{
	
	@ValueMapValue
	public String firstname;		// it should be same as crxd 
	
	@ValueMapValue
	public String lastname;			// it should be same as crxd

	@ValueMapValue
	public int numberfield;		// it should be same as crxd 
	
	@ValueMapValue
	public String datefield;			// it should be same as crxd
	
	@ValueMapValue
	public List<String> skills;
	
	@ChildResource(name = "projects")	// Same as crxde
	public List<Project> projects;

	@Override
	public String getfirstname() {
		return firstname;
	}

	@Override
	public String getlastname() {
		return lastname;
	}

	@Override
	public int getnumberfield() {
		return numberfield;
	}

	@Override
	public String getdatefield() {
		return datefield;
	}

	@Override
	public List<String> getskills() {
		
		return skills;
	}
	
	@Override
	public List<Project> getprojects() {
		return projects;
	}

}
