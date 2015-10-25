package characterStructure;
import java.util.*;
import roomConstructor.*;



//Class for handling the player
public class Player extends Character {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent

	public Player(Room roomIn) {
		heldItems = new ArrayList<Item>();
		roomIamIn = roomIn;
	}
	
	
	public void move() {
		//I don't think this is a good idea? -Owen
		//Then why did you write it? - Mikey
		System.out.println("Move called in player, should not be called");
	}
	
}