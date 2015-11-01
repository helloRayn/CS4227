package UI;

import decorator.Items;
import characterStructure.Character;

public interface UserInterface {
	
	public void viewItems(Character theCharacter);
	public void useItem(Items theItem);
	
	public void display(String toDisplay);

}
