package decorator;

public class Shiny_Decorator extends ItemDecorator {
	
	public Shiny_Decorator (Items itemToBeDecorated){
		super(itemToBeDecorated);
	}
	
	public String getName(){
		return "Shiny " + (super.getName());
	}
	
	
	public String getDesc(){
		return (super.getDesc()) + " that is shiny";
	}
	
	public void Use(){
		itemToBeDecorated.Use();
	}
}
