package characterStructure;

public class RunnableNotify implements Runnable
{
			
	private ObserverOfCharacter observerToNotify;
	private String name;
	
	public RunnableNotify(ObserverOfCharacter observerIn, String inName)
	{
		observerToNotify = observerIn;
		name = inName;
	}
	
	public void run()
	{
		observerToNotify.notifyThisObserver();
		System.out.println(this.name + " has completed.");
	}
	
	public String getRunnableName()
	{
		return this.name;
	}
}