package UI;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

import characterStructure.GameCharacter;
import decorator.Door;
import decorator.Items;
import UI.MoveListener;


public class GraphicUserInterface extends JFrame implements UserInterface {

	private JPanel contentPane;
	//private JTextArea narratorArea;

	private JButton northButton;
	private JButton westButton;
	private JButton eastButton;
	private JButton southButton;

	private DefaultListModel<Items> defaultMyItemList;
	private DefaultListModel<Items> defaultRoomItemList;
	private DefaultListModel<String> narration;
	
	
	/**
	 * Create the frame.
	 */
	public GraphicUserInterface() {
		initialSetup();
		addButtons(null, null, null, null);
	}
	
	private void initialSetup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adds text area for descriptions of rooms and narration etc.
		JScrollPane narratorArea = new JScrollPane();//This allows for a scroll bar
		narration = new DefaultListModel<String>();
		JList<String> narrationList = new JList<String>(narration);
		narratorArea.setBounds(22, 24, 158, 172);
		narratorArea.setViewportView(narrationList);
		contentPane.add(narratorArea);
		
		//Shows items in room
		JLabel roomItemsLabel = new JLabel("Room Items");
		roomItemsLabel.setBounds(222, 143, 57, 14);
		contentPane.add(roomItemsLabel);
		//List of items 
		defaultRoomItemList = new DefaultListModel<Items>();
		JList<Items> roomItems = new JList<Items>(defaultRoomItemList);
		//In order to have scrollbar
		JScrollPane roomItemsList = new JScrollPane();
		roomItemsList.setBounds(208, 168, 94, 82);
		roomItemsList.setViewportView(roomItems);
		contentPane.add(roomItemsList);
		
		//Shows items in inventory
		JLabel myItemsLabel = new JLabel("My Items");
		myItemsLabel.setBounds(347, 143, 46, 14);
		contentPane.add(myItemsLabel);
		//List of inventory
		defaultMyItemList = new DefaultListModel<Items>();
		JList<Items> myItems = new JList<Items>(defaultMyItemList);
		//In order to have scroll bar
		JScrollPane myItemsList = new JScrollPane();
		myItemsList.setBounds(324, 168, 89, 82);
		myItemsList.setViewportView(myItems);
		contentPane.add(myItemsList);
		
				
		//Uses item. Unfinished
		JButton roomUseButton = new JButton("Use Room Item");
		JButton myUseButton = new JButton("Use My Item");
		ItemSelectionListener roomItemsListener = new ItemSelectionListener(roomItems);
		ItemSelectionListener myItemsListener = new ItemSelectionListener(myItems);
		roomUseButton.addActionListener(roomItemsListener);
		myUseButton.addActionListener(myItemsListener);
		roomUseButton.setBounds(32, 207, 131, 23);
		myUseButton.setBounds(32, 230, 131, 23);
		contentPane.add(myUseButton);
		contentPane.add(roomUseButton);
	}

	//Set up directional buttons and their listeners
	private void addButtons(Door north, Door east, Door west, Door south) {
		//Remove previous buttons
		try {
		contentPane.remove(northButton);
		} catch (NullPointerException e) {
			//Button isn't visible
		}
		try {
		contentPane.remove(eastButton);
		} catch (NullPointerException e) {
			//Button isn't visible
		}
		try {
		contentPane.remove(westButton);
		} catch (NullPointerException e) {
			//Button isn't visible
		}
		try {
		contentPane.remove(southButton);
		} catch (NullPointerException e) {
			//Button isn't visible
		}


		//Check if null before adding buttons. Null means no door in that direction
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
		//Updates list on gui with items
		defaultMyItemList = theCharacter.getItems();
	}
	public void useItem(Items theItem) {
		//For later implementation
	}
	public void display(String toDisplay) {
		//For showing text on screen. For use with narratorArea
		narration.addElement(toDisplay);
	}

	public void showDoors(Door north, Door east, Door west, Door south) {
		addButtons(north, east, west, south);
	}
}
