import java.util.*;
//Class for handling the player
public class Player implements Character
{
	private ArrayList<Item> heldItems;

	public Player()
	{
		heldItems = new ArrayList<Item>();
	}
	
	public ArrayList<Item> getItems()
	{
		return heldItems;
	}
	public void addItem(Item newItem)
	{
		heldItems.add(newItem);
	}
	public void insertItem(Item newItem, int index)
	{
		heldItems.add(index, newItem);
	}
	
	public void move()
	{
		//I don't think this is a good idea? -Owen
		System.out.println("Move called in player, should not be called");
	}
	
}