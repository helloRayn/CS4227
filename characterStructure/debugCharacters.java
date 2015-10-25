package characterStructure;
import roomConstructor.Room;
import roomConstructor.NormalRoom;

public class debugCharacters {
	//Class used for debugging Characters, npc, players and AI.
		public static void main(String[] args) 	{
		
			Character one = new NPC(new AI_Stay(), new NormalRoom());
			Character two = new Player(new NormalRoom());
			
			two.move();
			one.move();
		}
}
