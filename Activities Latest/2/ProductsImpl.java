package com.adobe.ase.aem.training.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.ase.aem.training.core.models.Products;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {Products.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProductsImpl implements Products{
	@SlingObject
	Resource resource;
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String name;
	@ValueMapValue
	public int price;
	@ValueMapValue
	public String image;
	@ValueMapValue
	public Boolean stock;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public Boolean getStock() {
		// TODO Auto-generated method stub
		return stock;
	}
	
}
