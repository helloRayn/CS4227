package characterStructure;
import java.util.*;

import roomConstructor.*;

//Interface for grouping player and npc classes.
public abstract class Character {

	protected Room roomIamIn;
	protected ArrayList<Item> heldItems;
	
	//Getters and setters
	//returns room that the character is in
	public Room getRoomIamIn() {
		return roomIamIn;
	}//sets (moves) the character in a room
	public void setRoomIamIn(Room newRoom) {
		roomIamIn = newRoom;
	}
	
	//Returns list of items carried by character
	public ArrayList<Item> getItems() {
		return heldItems;
	}//adds item to list
	public void addItem(Item newItem) {
		heldItems.add(newItem);
	}
	public void removeItem(Item newItem) {
		heldItems.remove(newItem);
	}
	
	//Is this really necessary? - Mike
	public void insertItem(Item newItem, int index) {
		heldItems.add(index, newItem);
	}
	
	//I'm not sure about this method, we need to talk about how we move npcs. -Owen
	public abstract void move();
}