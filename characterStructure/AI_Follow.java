package characterStructure;
import javax.swing.DefaultListModel;

public class AI_Follow implements Strategy_AI_Interface
{
	//example AI class
	public AI_Follow() 	{
	}
	
	public void execute(DefaultListModel<AI_Asset> interactable) {
		System.out.println("Follow AI Executed.");
	}
	public void execute(AI_Asset interactable) {
		System.out.println("Follow AI Executed.");
	}
}