@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},
adapters = {CompositeMultifieldInterfaceIMPL.class},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
	
public class CompositeMultifieldInterfaceIMPL implements CompositeMultifieldInterface{
	@SlingObject
	Resource resource;
	
	@Self
	SlingHttpServletRequest request;
	
	@ValueMapValue
	public String name;

	@Override
	public String getName() {
		return name;
	}

}

