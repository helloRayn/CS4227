package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Game;
import decorator.Door;

public class MoveListener implements ActionListener {

//Door for moving through
private Door direction;
private String message;

	public MoveListener() {
		//Do nothing
		message = "You have entered another room!";
	}
	public MoveListener(Door exit) {
		//Set the parameter as the player reference
		setDoor(exit);
	}
	
	public void actionPerformed(ActionEvent e) {
		//Changes the current room to that one selected
		Game.changeRoom(direction);
		
		//Displays message
		Game.display(direction.getDesc());

		//Send to log file
		InputLogger.log("User selected " + direction.getName() + " door.");
	}

	public void setDoor(Door exit) {
		direction = exit;
	}
	public Door getDoor() {
		return direction;
	}
	public void setMessage(String phrase) { message = phrase; }
	public String getMessage() { return message; }

}
