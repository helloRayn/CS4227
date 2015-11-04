package characterStructure;
import roomConstructor.*;

public class AI_Stay implements Strategy_AI_Interface
{
	//Example AI CLASS
	public AI_Stay() 	{
	}
	
	public void execute(ArrayList<USEABLE_BY_AI> Stuff_Used_By_Our_AI) 	{
		System.out.println("Stay AI Executed.");
	}
}