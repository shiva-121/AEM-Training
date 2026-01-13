package com.adobe.ase.aem.training.core.models;

import java.util.List;

import com.adobe.cq.wcm.core.components.models.Component;

public interface ProductCatalog extends Component{
	public List<Catagory> getCatagory();
	public List<Products> getProducts();

}
