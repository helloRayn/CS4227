package Item;
abstract class ItemDecorator implements Items {
	
	protected Items itemToBeDecorted;
	protected String name;
	protected String desc;
	
	public ItemDecorator (Items itemToBeDecorted){
		this.itemToBeDecorted = itemToBeDecorted;
	}
	
	public String getName(){
		return itemToBeDecorted.getName();
	}
	
	public String getDesc(){
		return itemToBeDecorted.getDesc();
	}
	
}
class TestItem extends ItemDecorator {
	
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
}