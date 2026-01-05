package com.adobe.ase.aem.training.core.models.impl;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.via.ResourceSuperType;

import com.adobe.ase.aem.training.core.datalayer.TitleData;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.experimental.Delegate;

/**
 * 
 * @author pavan.kumar.nagaraj
 *  
 *  @CopyRight 2021 Accenture
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  
 */

@Model(adaptables = { SlingHttpServletRequest.class, Resource.class }, adapters = { TitleImpl.class,
		com.adobe.cq.wcm.core.components.models.Title.class,
		ComponentExporter.class }, resourceType = { TitleImpl.RESOURCE_TYPE })
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)

public class TitleImpl implements com.adobe.cq.wcm.core.components.models.Component,
com.adobe.cq.wcm.core.components.models.Title {

	protected static final String RESOURCE_TYPE = "ase/components/title";
	
	/**
	 * Extending Core Component - Delegation Mechanism
	 */
	@Self(injectionStrategy = InjectionStrategy.OPTIONAL)
	@Via(type = ResourceSuperType.class)
	@Delegate
	private com.adobe.cq.wcm.core.components.models.Title superself;
	
	/**
	 * Injected request object
	 */
	@SlingObject
	SlingHttpServletRequest request;

	/**
	 * Overriding DataLayer to return custom data
	 */
	@Override
	@JsonProperty("Title-Datalayer")
	public ComponentData getData() {
		TitleData titleData = this.request.adaptTo(TitleData.class);
		return titleData;
	}
}
