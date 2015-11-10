package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

import characterStructure.GameCharacter;
import decorator.Items;
import UI.MoveListener;


public class GraphicUserInterface extends JFrame implements UserInterface {

	private JPanel contentPane;
	private JList roomItemsList;
	private JList myItemsList;

	private JButton northButton;
	private JButton westButton;
	private JButton eastButton;
	private JButton southButton;
	
	
	/**
	 * Create the frame.
	 */
	public GraphicUserInterface() {
		initialSetup();
		addListeners(null, null, null, null);
	}
	
	private void initialSetup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adds text area for descriptions of rooms and narration etc.
		JTextArea narratorArea = new JTextArea();
		narratorArea.setBounds(22, 24, 158, 172);
		contentPane.add(narratorArea);
		
		//For memento pattern. Shows text from previous room.
		JButton previousRoomButton = new JButton("<< Previous Room");
		previousRoomButton.setBounds(32, 207, 131, 23);
		contentPane.add(previousRoomButton);
		
		//Shows items in room
		JLabel roomItemsLabel = new JLabel("Room Items");
		roomItemsLabel.setBounds(222, 143, 57, 14);
		contentPane.add(roomItemsLabel);
		//List of items 
		roomItemsList = new JList();
		roomItemsList.setBounds(208, 168, 94, 82);
		contentPane.add(roomItemsList);
		
		//Shows items in inventory
		JLabel myItemsLabel = new JLabel("My Items");
		myItemsLabel.setBounds(347, 143, 46, 14);
		contentPane.add(myItemsLabel);
		//List of inventory
		myItemsList = new JList();
		myItemsList.setBounds(324, 168, 89, 82);
		contentPane.add(myItemsList);
	}

	//Set up directional buttons and their listeners
	private void addButtons(Door north, Door east, Door west, Door south) {
		//Remove previous buttons
		contentPane.remove(northButton);
		contentPane.remove(eastButton);
		contentPane.remove(westButton);
		contentPane.remove(southButton);


		//Check if null before adding buttons.
		if(north != null) {
			//Declare listeners
			ActionListener northListener = new MoveListener(north);

			//Declare buttons
			northButton = new JButton("North");
			northButton.setBounds(265, 25, 89, 23);

			//Add listeners to buttons
			northButton.addActionListener(northListener);

			//Add buttons to panel
			contentPane.add(northButton);
		}//Repeat for other directions
		if(east != null) {
			ActionListener eastListener = new MoveListener(east);
			eastButton = new JButton("East");
			eastButton.setBounds(335, 59, 89, 23);
			eastButton.addActionListener(eastListener);

			contentPane.add(eastButton);
		}
		if(west != null) {
			ActionListener westListener = new MoveListener(west);
			westButton = new JButton("West");
			westButton.setBounds(190, 59, 89, 23);
			westButton.addActionListener(westListener);

			contentPane.add(westButton);
		}
		if(south != null) {
			ActionListener southListener = new MoveListener(south);
			southButton = new JButton("South");
			southButton.setBounds(265, 93, 89, 23);
			southButton.addActionListener(southListener);

			contentPane.add(southButton);
		}
	}

	
	//Interface Methods
	public void viewItems(GameCharacter theCharacter) {
		contentPane.remove(myItemsList);

		ArrayList<Items> itemList = theCharacter.getItems();
		
		//No idea if this will work
		myItemsList = new JList(theCharacter.getItems().toArray())
		myItemsList.setBounds(324, 168, 89, 82);
		contentPane.add(myItemsList);
	}
	public void useItem(Items theItem) {
		//For later implementation
	}
	public void display(String toDisplay) {
		//For showing text on screen. For use with narratorArea
	}
}
