package characterStructure;
import java.util.*;
import roomConstructor.*;



//Class for handling the player
public class Player extends Character {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent

	public Player(Room startRoom) {
		super(startRoom);
	}
	
	
	public void move(Door exit) {
		System.out.println("Move called in player, should not be called");
	}
	
		//Notifies all rooms that observes characters
	@Override
	public void notifyAll()
	{
		for(int i = 0; i < listOfObservers.Size(); i++)
		{
			listOfObservers.get(i).notify();
		}
	}
	
}