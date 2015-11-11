package characterStructure;
import java.util.ArrayList;

import roomConstructor.*;

public class AI_Stay implements Strategy_AI_Interface
{
	//Example AI CLASS
	public AI_Stay() 	{
	}
	
	public void execute(ArrayList<AI_Asset> interactable) {
		System.out.println("Stay AI Executed.");
	}
}