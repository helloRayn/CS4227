package decorator;

public abstract class ItemDecorator implements Items {
	
	protected Items itemToBeDecorated;
	protected String name;
	protected String desc;
	
	public ItemDecorator (Items itemToBeDecorated){
		this.itemToBeDecorated = itemToBeDecorated;
	}
	
	public String getName(){
		return itemToBeDecorated.getName();
	}
	
	
	public String getDesc(){
		return itemToBeDecorated.getDesc();
	}
	
	public void Use(){
		itemToBeDecorated.Use();
	}
	
}