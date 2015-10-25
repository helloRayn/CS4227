import java.util.*;
//Class for NPC's (NON-PLAYER-CHARACTERS, a.k.a. computer controlled characters)
public class NPC implements Character
{
	private ArrayList<Item> heldItems;
	private Strategy_AI_Interface movementAI;

	public NPC(Strategy_AI_Interface inAI)
	{
		heldItems = new ArrayList<Item>();
		movementAI = inAI;
	}
	
	//execute AI movement logic
	public void move()
	{
		movementAI.execute();
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
	
}