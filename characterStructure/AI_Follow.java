package characterStructure;
import roomConstructor.*;

public class AI_Follow implements Strategy_AI_Interface
{
	//example AI class
	public AI_Follow() 	{
	}
	
	public void execute(Room currentRoom) 	{
		System.out.println("Follow AI Executed.");
	}
}