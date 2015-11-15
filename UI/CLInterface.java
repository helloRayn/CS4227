package UI;

import characterStructure.GameCharacter;
import decorator.Door;
import decorator.Items;

import java.util.Scanner;

import javax.swing.DefaultListModel;

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

	public void showDoors(Door north, Door east, Door west, Door south) {
		if(north != null)
			System.out.println("There is a door to the north");
		if(east != null)
			System.out.println("There is a door to the east");
		if(west != null)
			System.out.println("There is a door to the west");
		if(south != null)
			System.out.println("There is a door to the south");
	}
}
