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
	
	
	/**
	 * Create the frame.
	 */
	public GraphicUserInterface() {
		initialSetup();
		addListeners();
	}
	
	private void initialSetup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea narratorArea = new JTextArea();
		narratorArea.setBounds(22, 24, 158, 172);
		contentPane.add(narratorArea);
		
		JButton previousRoomButton = new JButton("<< Previous Room");
		previousRoomButton.setBounds(32, 207, 131, 23);
		contentPane.add(previousRoomButton);
		
		JLabel roomItemsLabel = new JLabel("Room Items");
		roomItemsLabel.setBounds(222, 143, 57, 14);
		contentPane.add(roomItemsLabel);
		
		JLabel myItemsLabel = new JLabel("My Items");
		myItemsLabel.setBounds(347, 143, 46, 14);
		contentPane.add(myItemsLabel);
		
		roomItemsList = new JList();
		roomItemsList.setBounds(208, 168, 94, 82);
		contentPane.add(roomItemsList);
		
		myItemsList = new JList();
		myItemsList.setBounds(324, 168, 89, 82);
		contentPane.add(myItemsList);
	}

	//Set up directional buttons and their listeners
	private void addListeners() {
		//Declare listeners
		MoveListener northListener = new MoveListener();
		MoveListener eastListener = new MoveListener();
		MoveListener westListener = new MoveListener();
		MoveListener southListener = new MoveListener();

		//Declare buttons
		JButton northButton = new JButton("North");
		northButton.setBounds(265, 25, 89, 23);
		
		JButton westButton = new JButton("West");
		westButton.setBounds(190, 59, 89, 23);
		
		JButton eastButton = new JButton("East");
		eastButton.setBounds(335, 59, 89, 23);
		
		JButton southButton = new JButton("South");
		southButton.setBounds(265, 93, 89, 23);

		//Add listeners to buttons
		northButton.addActionListener(northListener);
		westButton.addActionListener(westListener);
		eastButton.addActionListener(eastListener);
		southButton.addActionListener(southListener);

		//Add buttons to panel
		contentPane.add(southButton);
		contentPane.add(northButton);
		contentPane.add(westButton);
		contentPane.add(eastButton);
	}

	
	//Interface Methods
	public void viewItems(GameCharacter theCharacter) {
		/*ArrayList<Items> itemList = theCharacter.getItems();
		
		//No idea if this will work
		myItemsList = new JList(theCharacter.getItems().toArray())
		myItemsList.setBounds(324, 168, 89, 82);
		contentPane.add(myItemsList);*/
	}
	public void useItem(Items theItem) {

	}
	public void display(String toDisplay) {

	}
}
