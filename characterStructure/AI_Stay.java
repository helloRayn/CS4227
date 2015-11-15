package characterStructure;
import javax.swing.DefaultListModel;

import main.Game;

public class AI_Stay implements Strategy_AI_Interface
{
	//Example AI CLASS
	public AI_Stay() 	{
	}
	
	public void execute(DefaultListModel<AI_Asset> interactable) {
		Game.display("Stay AI Executed.");
	}
	public void execute(AI_Asset interactable) {
		Game.display("Stay AI Executed.");
	}
}