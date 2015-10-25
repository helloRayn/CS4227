package decorator;

public abstract class Door implements Items{
	
	private String name;
	private String desc;
	
	//Default constructor
	public Door() {
		setName("No Name.");
		setDesc("No Description.");
	}
	
	//Override from Interface. Gets the name and description
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	
	//Setters
	public void setName(String name) {	this.name = name;}
	public void setDesc(String desc) { 	this.desc = desc;}
}
