package characterStructure;
import java.util.*;
import roomConstructor.*;



//Class for NPC's (NON-PLAYER-CHARACTERS, a.k.a. computer controlled characters)
public class NPC extends Character {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent
	private Strategy_AI_Interface movementAI;

	public NPC(Strategy_AI_Interface inAI, Room roomIn) 	{
		heldItems = new ArrayList<Item>();
		movementAI = inAI;
		roomIamIn = roomIn;
	}
	
	//execute AI movement logic
	@Override
	public void move() 	{
		movementAI.execute(roomIamIn);
	}
	
}