package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import decorator.Items;
import characterStructure.GameCharacter;

public class MoveListener implements ActionListener {

	//Reference to the player to call move actions
	private GameCharacter thePlayer;

	public MoveListener() {
		//Do nothing
	}
	public MoveListener(GameCharacter thePlayer) {
		//Set the parameter as the player reference
		setPlayer(thePlayer);
	}
	
	public void actionPerformed(ActionEvent e) {
		//thePlayer.move(theDoor);
		System.out.println("I'm listening...");
	}

	public void setPlayer(GameCharacter thePlayer) {
		this.thePlayer = thePlayer;
	}

}
