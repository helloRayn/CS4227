package characterStructure;
import java.util.*;
import roomConstructor.*;



//Class for NPC's (NON-PLAYER-CHARACTERS, a.k.a. computer controlled characters)
public class NPC implements Character {
	private ArrayList<Item> heldItems;
	private Strategy_AI_Interface movementAI;
	private Room roomIamIn;

	public NPC(Strategy_AI_Interface inAI, Room roomIn) 	{
		heldItems = new ArrayList<Item>();
		movementAI = inAI;
		roomIamIn = roomIn;
	}
	
	//execute AI movement logic
	public void move() 	{
		movementAI.execute();
	}
	
	public Room getRoomIamIn()
	{
		return roomIamIn;
	}
	
	public void setRoomIamIn(Room newRoom)
	{
		roomIamIn = newRoom;
	}
	
	public ArrayList<Item> getItems() 	{
		return heldItems;
	}
	
	public void addItem(Item newItem) 	{
		heldItems.add(newItem);
	}
	
	public void insertItem(Item newItem, int index) 	{
		heldItems.add(index, newItem);
	}
	
}