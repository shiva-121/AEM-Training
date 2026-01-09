@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {ComponentInterface.class, ComponentExporter.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
resourceType = "/apps/ase/components/path-to-component")
	
public class ComponentInterfaceIMPL implements ComponentInterface{
	
	@ChildResource(name="fieldName")
	public List<CompositeMultifieldInterface> fieldName;

	@Override
	public List<CompositeMultifieldInterface> getCompositeMultifield() {
		return fieldName;
	}

}

