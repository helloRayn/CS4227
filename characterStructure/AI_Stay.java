package characterStructure;
import javax.swing.DefaultListModel;

public class AI_Stay implements Strategy_AI_Interface
{
	//Example AI CLASS
	public AI_Stay() 	{
	}
	
	public void execute(DefaultListModel<AI_Asset> interactable) {
		System.out.println("Stay AI Executed.");
	}
}