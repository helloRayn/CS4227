package characterStructure;
import java.util.*;

import decorator.Items;
import roomConstructor.*;

//Interface for grouping player and npc classes.
public abstract class Character{

	protected Room roomIamIn;
	protected ArrayList<Items> heldItems;
	protected int itemCount;
	
	//Constructor (For use by NPCs)
	public Character() {
		heldItems = new ArrayList<Items>();
	}
	//Overloaded constructor
	public Character(Room startRoom) {
		heldItems = new ArrayList<Items>();
		setRoomIamIn(startRoom);
	}
	
	public void registerObserver(ObserverOfCharacter inObserver)
	{
		listOfObservers.add(inObserver);
	}
	
	public void unregisterObserver(ObserverOfCharacter inObserver)
	{
		for(int i = 0; i < listOfObservers.Size(); i++)
		{
			if(inObserver.getName().matches(listOfObservers.get(i).getObserverName()))
			{
				inObserver.remove(i);
				break;
			}
		}
	}
	
	public abstract void notifyAll()
	
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
	
	//Is this really necessary? - Mike
	public void insertItem(Items newItem, int index) {
		heldItems.add(index, newItem);
	}
	
	//I'm not sure about this method, we need to talk about how we move npcs. -Owen
	public abstract void move(Door exit);
}