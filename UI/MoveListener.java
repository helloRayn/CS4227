package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import decorator.Items;
import decorato.Door;
import characterStructure.GameCharacter;

public class MoveListener implements ActionListener {

//Door for moving through
private Door exit;

	public MoveListener() {
		//Do nothing
	}
	public MoveListener(Door exit) {
		//Set the parameter as the player reference
		setPlayer(thePlayer);
	}
	
	public void actionPerformed(ActionEvent e) {
		exit.move();
	}

	public void setDoor(Door exit) {
		direction = theDirection;
	}

}
