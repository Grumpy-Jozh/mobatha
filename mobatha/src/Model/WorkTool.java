package Model;

public class WorkTool extends BaseObject {
	private String type;
	private Manufacturer manufacturer = new Manufacturer();
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	
	public WorkTool() {
		super();
	}
	
	public WorkTool(WorkTool obj) {
		super(obj);
		if (obj == null) return;
		type = obj.type;
		manufacturer = new Manufacturer(obj.manufacturer);
	}
	

}
