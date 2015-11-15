package UI;

import decorator.Door;
import decorator.Items;
import characterStructure.GameCharacter;

public interface UserInterface {
	
	public void viewItems(GameCharacter theCharacter);
	public void useItem(Items theItem);
	public void display(String toDisplay);
	public void displayWarning(String toDisplay);
	public void showDoors(Door north, Door east, Door west, Door south);

}
