package characterStructure;

import javax.swing.DefaultListModel;

import roomConstructor.*;



//Class for handling the player
public class Player extends GameCharacter {
	// protected ArrayList<Item> heldItems;		Declared in parent
	// protected Room roomIamIn;				Declared in parent
	protected DefaultListModel<ObserverOfCharacter> myObservers;

	public Player(Room startRoom) {
		super(startRoom);
	}
	
	public void setObservers(DefaultListModel<ObserverOfCharacter> yourObservers) { myObservers = yourObservers; }
	public void addObserver(ObserverOfCharacter inObserver)
	{
		myObservers.addElement(inObserver);
	}
	
	public void removeObserver(int indexOfObserverToRemove)
	{
		myObservers.remove(indexOfObserverToRemove);
	}
	
	public void sequentialNotifyAll()//NotifyAll is a method of Object and therefore cannot be overwritten.
	{
		for(int i = 0; i < myObservers.size(); i++)
		{
			myObservers.get(i).notifyThisObserver();
			//Modify notifyThisObserver to take in whatever the observers will need to know -Owen
		}
	}
	
	public void threadedNotifyAll()// a multithreaded version of notifyAll
	{
		for(int i = 0; i < myObservers.size(); i++)
		{
			Thread athread = new Thread(new RunnableNotify(myObservers.getElementAt(i), "Notifier Thread " + i));//notifyThisObserver is called inside run() of RunnableNotify() 
			athread.start();
		}
	}
	
	@Override
	public void execute(DefaultListModel<AI_Asset> interactable) {
		//This method doesn't need to use the assets passed to it, but it may(this might make getting doors easier).-Owen
		System.out.println("Move called in player");
	}
	@Override
	public void execute(AI_Asset interactable) {
		//This method doesn't need to use the assets passed to it, but it may(this might make getting doors easier).-Owen
		System.out.println("Move called in player");
	}
	
}