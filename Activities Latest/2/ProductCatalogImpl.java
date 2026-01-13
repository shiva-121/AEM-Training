package com.adobe.ase.aem.training.core.models.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.ase.aem.training.core.models.Catagory;
import com.adobe.ase.aem.training.core.models.ProductCatalog;
import com.adobe.ase.aem.training.core.models.Products;
import com.adobe.cq.export.json.ComponentExporter;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {ProductCatalog.class, ComponentExporter.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
resourceType = "/apps/ase/components/sample/productCatalog")
public class ProductCatalogImpl implements ProductCatalog{
	
	@ChildResource(name="catagory")
	public List<Catagory> catagory;
	@ChildResource(name="products")
	public List<Products> products;
	
	@Override
	public List<Catagory> getCatagory() {
		// TODO Auto-generated method stub
		return catagory;
	}

	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

}
