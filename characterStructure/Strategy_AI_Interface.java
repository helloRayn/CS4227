package characterStructure;
import roomConstructor.Room;
import java.util.ArrayList;

public interface Strategy_AI_Interface {
	
	// Method called based off of current room. We may add more commands.
	//Modified to take in an arraylist (makes more sense).
	public void execute(ArrayList<AI_Asset> interactable);
}