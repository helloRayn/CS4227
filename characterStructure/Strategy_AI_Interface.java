package characterStructure;
import roomConstructor.Room;
import java.util.ArrayList;

public interface Strategy_AI_Interface {
	
	// Method called based off of current room. We may add more commands.
	public void execute(AI_Object interactable);
}