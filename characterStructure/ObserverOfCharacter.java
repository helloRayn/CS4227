package characterStructure;

public interface ObserverOfCharacter
{
	//Subject has a list of observers, and needs to register and unregister, this is required for
	//  identifying these observers.
	public String getObserverName();

	//Necessary for Observer pattern.
	//Notify is already a method of Object.
	public void notifyThisObserver();
}