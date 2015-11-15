package characterStructure;

public class TestNpcConfiguration extends NpcConfiguration {

	/*	Inherits (Along with setters/getters)
	protected I_RoomFactory roomBuilder;
	protected Room npcRoom;
	*/

	public TestNpcConfiguration() {
		super();
	}

	@Override
	public void startUp() {
		//For test I'll make 5 NPCs with AI_Stay
		Strategy_AI_Interface stay = new AI_Stay();

		GameCharacter tom 	= 	new NPC(stay, npcRoom);
		GameCharacter dick 	= 	new NPC(stay, npcRoom);
		GameCharacter harry = 	new NPC(stay, npcRoom);
		GameCharacter wang 	= 	new NPC(stay, npcRoom);
		GameCharacter ahab 	= 	new NPC(stay, npcRoom);

		tom.execute(npcRoom);
		dick.execute(npcRoom);
		harry.execute(npcRoom);
		wang.execute(npcRoom);
		ahab.execute(npcRoom);
		//Good dogs
	}
}