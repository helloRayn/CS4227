package Item;
//import Item.*;
public class Main {
	
	public static void main(String [] arg){
		
		Items I = new SimpleItem();
		System.out.println(I.getName());
		System.out.println(I.getDesc());
		
		I = new TestItem(I);
		System.out.println(I.getName());
		System.out.println(I.getDesc());
	}
}