package com.adobe.ase.aem.training.core.models;

import java.util.List;

import com.adobe.cq.wcm.core.components.models.Component;

public interface Recipe extends Component{
	public List<String> ingredients();
	public List<MRecipe> recipes();
}
