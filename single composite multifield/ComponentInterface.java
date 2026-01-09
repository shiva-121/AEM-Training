import com.adobe.cq.wcm.core.components.models.Component;

public interface ComponentInterface extends Component{
	public List<CompositeMultifieldInterface> getCompositeMultified();

	// Add methods for other fields with suitable datatype and provide mapping implementation in impl class
}
