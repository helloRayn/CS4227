package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import decorator.Items;
import characterStructure.GameCharacter;

public class MoveListener implements ActionListener {

private String direction;
	public MoveListener() {
		//Do nothing
	}
	public MoveListener(String theDirection) {
		//Set the parameter as the player reference
		setPlayer(thePlayer);
	}
	
	public void actionPerformed(ActionEvent e) {
		moveDirection(direction);
		//We could use maps to decide directions etc.
	}

	public void setDirection(String theDirection) {
		direction = theDirection;
	}

}
