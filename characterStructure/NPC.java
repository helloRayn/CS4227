package characterStructure;

import javax.swing.DefaultListModel;

import roomConstructor.*;
import decorator.Items;



//Class for NPC's (NON-PLAYER-CHARACTERS, a.k.a. computer controlled characters)
public class NPC extends GameCharacter {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent
	private Strategy_AI_Interface movementAI;

	public NPC(Strategy_AI_Interface inAI, Room roomIn) 	{
		heldItems = new DefaultListModel<Items>();
		movementAI = inAI;
		roomIamIn = roomIn;
	}
	
	//execute AI movement logic
	@Override
	public void execute(DefaultListModel<AI_Asset> interactable) {
		//This method doesn't need to use the assets passed to it, but it may(this might make getting doors easier).-Owen
		movementAI.execute(interactable);
	}
	@Override
	public void execute(AI_Asset interactable) {
		movementAI.execute(interactable);
	}
	
}