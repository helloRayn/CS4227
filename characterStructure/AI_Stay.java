package characterStructure;
import roomConstructor.*;

public class AI_Stay implements Strategy_AI_Interface
{
	//Example AI CLASS
	public AI_Stay() 	{
	}
	
	public void execute(AI_Object theObject) 	{
		System.out.println("Stay AI Executed.");
	}
}