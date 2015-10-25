import java.util.*;
//Interface for grouping player and npc classes.
public interface Character
{
	public ArrayList<Item> heldItems = new ArrayList<Item>();
	public ArrayList<Item> getItems();
	public void addItem(Item newItem);
	public void insertItem(Item newItem, int index);
	
	//I'm not sure about this method, we need to talk about how we move npcs. -Owen
	public void move();
}