package decorator;


//This is an example item
public class Box implements Items  {
	private String name;
	private String desc;
	
	//Default constructor
	public Box() {
		setName("Box");
		setDesc("This is a Box");
	}
	
	//Override from Interface. Gets the name and description
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}

	public void Use(){
		
	}
	
	//Setters
	public void setName(String name) {	this.name = name;}
	public void setDesc(String desc) { 	this.desc = desc;}
}
