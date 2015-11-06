package characterStructure;
import java.util.ArrayList;

import roomConstructor.*;

public class AI_Follow implements Strategy_AI_Interface
{
	//example AI class
	public AI_Follow() 	{
	}
	
	public void execute(AI_Object interactable) {
		System.out.println("Follow AI Executed.");
	}
}