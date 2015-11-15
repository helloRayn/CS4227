package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Game;
import decorator.Door;

public class MoveListener implements ActionListener {

//Door for moving through
private Door direction;

	public MoveListener() {
		//Do nothing
	}
	public MoveListener(Door exit) {
		//Set the parameter as the player reference
		setDoor(exit);
	}
	
	public void actionPerformed(ActionEvent e) {
		//direction.move();
		System.out.println(direction.getName());
		Game.changeRoom(direction);

		//Send to log file
		InputLogger.log("User selected " + direction.getName() + " door.");
	}

	public void setDoor(Door exit) {
		direction = exit;
	}

}
