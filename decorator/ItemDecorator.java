package decorator;

abstract class ItemDecorator implements Items {
	
	protected Items itemToBeDecorated;
	protected String name;
	protected String desc;
	
	public ItemDecorator (Items itemToBeDecorated){
		this.itemToBeDecorated = itemToBeDecorated;
	}
	
	public String getName(){
		return itemToBeDecorated.getName();
	}
	
	//What does this even do? - Mikey
	public String getDesc(){
		return itemToBeDecorated.getName();
	}
	
}
/*class TestItem extends ItemDecorator {
	
	public TestItem (Items i){
		super(i);
		name = "test";
		desc = "This is a test";
	}
	
	public String getName(){
		return name;
	}
	
	public String getDesc(){
		return desc;
	}
}*/