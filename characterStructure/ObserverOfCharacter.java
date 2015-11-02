public interface ObserverOfCharacter
{
	private String observerName;
	
	public String getObserverName();

	public void notify();
}