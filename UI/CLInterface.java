package UI;

import java.util.ArrayList;
import characterStructure.GameCharacter;
import decorator.Items;
import java.util.Scanner;

public class CLInterface implements UserInterface {
	protected Scanner in;
	
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
		ArrayList<Items> itemList = theCharacter.getItems();
		
		System.out.println("Items Held:\t");
		while(itemcount > 0) {
			System.out.println(itemList.get(itemcount).getName());
			itemcount--;
		}
	}
	public void useItem(Items theItem) {
		//Blank for now
	}
	
	public void display(String toDisplay) {
		System.out.println(toDisplay);
	}
}
