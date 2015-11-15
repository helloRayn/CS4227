package characterStructure;

import javax.swing.DefaultListModel;

public class TestNpcConfiguration extends NpcConfiguration {

	/*	Inherits (Along with setters/getters)
	protected I_RoomFactory roomBuilder;
	protected Room npcRoom;
	protected DefaultListModel<ObserverOfCharacter> npcList;
	*/

	public TestNpcConfiguration() {
		super();
	}

	@Override
	public void startUp() {
		//For test I'll make 5 NPCs with AI_Stay
		Strategy_AI_Interface stay = new AI_Stay();

		NPC tom  = 	new NPC(stay, npcRoom);
		tom.setName("Tom");
		
		NPC dick = 	new NPC(stay, npcRoom);
		dick.setName("Dick");

		NPC harry = new NPC(stay, npcRoom);
		harry.setName("Harry");

		NPC wang = 	new NPC(stay, npcRoom);
		wang.setName("Wang");

		NPC ahab = 	new NPC(stay, npcRoom);
		ahab.setName("Ahab");
		//Good dogs

		tom.execute(npcRoom);
		dick.execute(npcRoom);
		harry.execute(npcRoom);
		wang.execute(npcRoom);
		ahab.execute(npcRoom);
		
		npcList.addElement(tom);
		npcList.addElement(dick);
		npcList.addElement(harry);
		npcList.addElement(wang);
		npcList.addElement(ahab);
		
		//for(int x = 0; x < 100; x++) {
		//	npcList.addElement(new NPC(stay, npcRoom));
		//}
	}
}