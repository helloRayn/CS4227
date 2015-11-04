package characterStructure;
import java.util.*;
import roomConstructor.*;
import decorator.Items;



//Class for NPC's (NON-PLAYER-CHARACTERS, a.k.a. computer controlled characters)
public class NPC extends GameCharacter implements USEABLE_BY_AI{
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent
	private Strategy_AI_Interface movementAI;

	public NPC(Strategy_AI_Interface inAI, Room roomIn) 	{
		heldItems = new ArrayList<Items>();
		movementAI = inAI;
		roomIamIn = roomIn;
	}
	
	//execute AI movement logic
	@Override
	public void move(ArrayList<USEABLE_BY_AI> Stuff_Used_By_Our_AI) 	{
		movementAI.execute(Stuff_Used_By_Our_AI);
	}
	
}