package characterStructure;
import java.util.*;

import decorator.Items;
import roomConstructor.*;

//Interface for grouping player and npc classes.
public abstract class GameCharacter {

	protected Room roomIamIn;
	protected ArrayList<Items> heldItems;
	protected int itemCount;
	
	//Constructor (For use by NPCs)
	public GameCharacter() {
		heldItems = new ArrayList<Items>();
	}
	//Overloaded constructor
	public GameCharacter(Room startRoom) {
		heldItems = new ArrayList<Items>();
		setRoomIamIn(startRoom);
	}
	
	
	
	
	//Getters and setters
	//returns room that the character is in
	public Room getRoomIamIn() {
		return roomIamIn;
	}//sets (moves) the character in a room
	public void setRoomIamIn(Room newRoom) {
		roomIamIn = newRoom;
	}
	
	//Returns list of items carried by character
	public ArrayList<Items> getItems() {
		return heldItems;
	}//Shows how many items held by player
	public int howManyItems() {
		return itemCount;
	}//adds item to list
	public void addItem(Items newItem) {
		heldItems.add(newItem);
		itemCount++;
	}//removes item
	public void removeItem(Items newItem) {
		heldItems.remove(newItem);
		itemCount--;
	}
	
	//I'm not sure about this method, we need to talk about how we move npcs. -Owen
	public abstract void move(AI_Object interactable);
}