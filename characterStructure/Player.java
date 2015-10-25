package characterStructure;
import java.util.*;
import roomConstructor.*;



//Class for handling the player
public class Player implements Character {
	private ArrayList<Item> heldItems;
	private Room roomIamIn;

	public Player(Room roomIn) {
		heldItems = new ArrayList<Item>();
		roomIamIn = roomIn;
	}
	
	public Room getRoomIamIn()
	{
		return roomIamIn;
	}
	
	public void setRoomIamIn(Room newRoom)
	{
		roomIamIn = newRoom;
	}
	
	public ArrayList<Item> getItems() {
		return heldItems;
	}
	public void addItem(Item newItem) {
		heldItems.add(newItem);
	}
	public void insertItem(Item newItem, int index) {
		heldItems.add(index, newItem);
	}
	
	public void move() {
		//I don't think this is a good idea? -Owen
		//Then why did you write it? - Mikey
		System.out.println("Move called in player, should not be called");
	}
	
}