package characterStructure;
import java.util.*;
import roomConstructor.*;

//Interface for grouping player and npc classes.
public interface Character {

	private Room roomIamIn;
	public Room getRoomIamIn();
	public void setRoomIamIn(Room newRoom);
	
	private ArrayList<Item> heldItems;
	private ArrayList<Item> getItems();
	public void addItem(Item newItem);
	public void insertItem(Item newItem, int index);
	
	//I'm not sure about this method, we need to talk about how we move npcs. -Owen
	public void move();
}