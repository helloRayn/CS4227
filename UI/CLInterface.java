package UI;

import characterStructure.GameCharacter;
import decorator.Door;
import decorator.Items;

import java.util.Scanner;

import javax.swing.DefaultListModel;

import main.Game;

public class CLInterface implements UserInterface {
	private Scanner in;
	
	//Default Constructor
	public CLInterface() {
		in = new Scanner(System.in);
	}
	//OverloadedConstructor
	public CLInterface(Scanner reader) {
		in = reader;
	}

	public void viewItems(GameCharacter theCharacter) {
		int itemcount = theCharacter.howManyItems();
		DefaultListModel<Items> itemList = theCharacter.getItems();
		
		System.out.println("Items Held:\t");
		InputLogger.log("Items Held: \t");
		while(itemcount > 0) {
			System.out.println(itemList.get(itemcount).getName());
			InputLogger.log(itemList.get(itemcount).getName());
			itemcount--;
		}
	}
	public void useItem(Items theItem) {
		//Blank for now
	}
	
	public void display(String toDisplay) {
		System.out.println(toDisplay);
		InputLogger.log("Displayed: \t" + toDisplay);
	}
	
	public void displayWarning(String toDisplay) {
		System.err.println(toDisplay);
		InputLogger.log("Displayed Warning: \t" + toDisplay);
	}

	public void showDoors(Door north, Door east, Door west, Door south) {
		if(north != null)
			display("There is a door to the (N)orth");
		if(east != null)
			display("There is a door to the (E)ast");
		if(west != null)
			display("There is a door to the (W)est");
		if(south != null)
			display("There is a door to the (S)outh");
		
		//Changes the current room to that one selected
		Door direction = north;
		boolean go = false;
		String input;
		while(!go) {
			display("Please enter your selection:");
			input = in.nextLine();
			InputLogger.log("User input: \t" + input);

			//Check if input corresponds with correct door
			if(north != null && input.matches("[nN]+([oO][rR][tT][hH])?")) {
				direction = north;
				go = true;
			}
			else if(east != null && input.matches("[eE]+([aA][sS][tT])?")) {
				direction = east;
				go = true;
			}
			else if(west != null && input.matches("[wW]+([eE][sS][tT])?")) {
				direction = west;
				go = true;
			}
			else if(south != null && input.matches("[sS]+([oO][uU][tT][hH])?")) {
				direction = south;
				go = true;
			}
			else if (input.matches("[eE][xX][iI][tT]"))
				exit();
			else
				displayWarning("Please select one of the given directions. Enter \"Exit\" to leave game.");
		}
		if (direction != null) {
			Game.changeRoom(direction);
			//Displays message
			Game.display(direction.getDesc());

			//Send to log file
			InputLogger.log("User selected " + direction.getName() + " door.");
		}
		
		
	}

	public void exit() {
		displayWarning("\n \n<Command accepted. Exiting game>");
		display("Thank you for playing!");

		//Close the PrintWriter
		InputLogger.log("===End of input===");
		InputLogger.close();
		//Exits the program
		System.exit(0);
	}
}
