package characterStructure;
import java.util.*;
import roomConstructor.*;



//Class for handling the player
public class Player extends GameCharacter implements USEABLE_BY_AI {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent

	public Player(Room startRoom) {
		super(startRoom);
	}
	
	
	public void move(ArrayList<USEABLE_BY_AI> Stuff_Used_By_Our_AI) {
		//This method doesn't need to use the assets passed to it, but it may(this might make getting doors easier).-Owen
		
		//I don't think this is a good idea? -Owen
		//Then why did you write it? - Mikey
		System.out.println("Move called in player, should not be called");
	}
	
}