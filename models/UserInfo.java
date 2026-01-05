package com.adobe.ase.aem.training.core.models;

import java.util.List;

import com.adobe.cq.wcm.core.components.models.Component;

public interface UserInfo extends Component {
	public String getfirstname();
	public String getlastname();
	public int getnumberfield();
	public String getdatefield();
	
	public List<String> getskills();
	public List<Project> getprojects();
}
