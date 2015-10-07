import java.util.*;
public class debugCharacters
{
//Class used for debugging Characters, npc, players and AI.
	public static void main(String[] args)
	{
		Character one = new NPC(new AI_Stay());
		Character two = new Player();
		
		two.move();
		one.move();
	}
}