package characterStructure;

public interface ObserverOfCharacter
{
	//Subject has a list of observers, and needs to register and unregister, this is required for
	//  identifying these observers.
	public String getObserverName();

	//Necessary for Observer pattern.
	public void notifyObservers();
}