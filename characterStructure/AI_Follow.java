package characterStructure;
import roomConstructor.*;

public class AI_Follow implements Strategy_AI_Interface
{
	//example AI class
	public AI_Follow() 	{
	}
	
	public void execute(ArrayList<USEABLE_BY_AI> Stuff_Used_By_Our_AI) 	{
		System.out.println("Follow AI Executed.");
	}
}