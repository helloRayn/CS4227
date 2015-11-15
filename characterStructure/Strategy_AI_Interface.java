package characterStructure;
import javax.swing.DefaultListModel;

public interface Strategy_AI_Interface {
	
	// Method called based off of current room. We may add more commands.
	//Modified to take in an arraylist (makes more sense).
	public void execute(AI_Asset interactable);
	public void execute(DefaultListModel<AI_Asset> interactable);
}