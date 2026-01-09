package com.adobe.ase.aem.training.core.models.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.MRecipe;
import com.adobe.ase.aem.training.core.models.Recipe;
import com.adobe.cq.export.json.ComponentExporter;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {Recipe.class, ComponentExporter.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
resourceType = "/apps/ase/components/sample/recipe")
public class RecipeImpl implements Recipe{
	
	@ValueMapValue
	public List<String> ingredients;
	
	@ChildResource(name = "recipes")
	public List<MRecipe> recipes;

	@Override
	public List<String> ingredients() {
		return ingredients;
	}

	@Override
	public List<MRecipe> recipes() {
		return recipes;
	}

	
}

