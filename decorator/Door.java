package decorator;

public abstract class Door implements Items {
	
	private String name;
	private String desc;
	private String exitRoom;
	
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
	public String getRoom() {
		return exitRoom;
	}
	
	//Setters
	public void setName(String name) {	this.name = name;}
	public void setDesc(String desc) { 	this.desc = desc;}
	public void setRoom(String desc) { 	this.desc = exitRoom;}
}
