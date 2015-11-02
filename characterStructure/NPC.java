package characterStructure;
import java.util.*;
import roomConstructor.*;
import decorator.Items;



//Class for NPC's (NON-PLAYER-CHARACTERS, a.k.a. computer controlled characters)
public class NPC extends Character {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent
	private Strategy_AI_Interface movementAI;

	public NPC(Strategy_AI_Interface inAI, Room roomIn) {
		heldItems = new ArrayList<Items>();
		movementAI = inAI;
		roomIamIn = roomIn;
	}
	
	//execute AI movement logic
	@Override
	public void move(Door exit) {
		movementAI.execute(roomIamIn);
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