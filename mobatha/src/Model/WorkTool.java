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
	
	

}
