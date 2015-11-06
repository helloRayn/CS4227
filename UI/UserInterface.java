package UI;

import decorator.Items;
import characterStructure.GameCharacter;

public interface UserInterface {
	
	public void viewItems(GameCharacter theCharacter);
	public void useItem(Items theItem);
	public void display(String toDisplay);

}
