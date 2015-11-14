package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.JOptionPane;

import decorator.Items;

public class ItemSelectionListener implements ActionListener {

	private JList<Items> myList;
	private String logData;

	public ItemSelectionListener() {
		//Do nothing yet
	}
	public ItemSelectionListener(JList<Items> theList) {
		setButton(theList);
	}

	public void actionPerformed(ActionEvent e) {
		if(!myList.isSelectionEmpty()) {
			//Find item that's selected
			int index = myList.getSelectedIndex();
			//Get list from JList
			ListModel<Items> itemList = myList.getModel();

			//Use item at index in items list
			/*itemList.getElement(index).use();*/
			System.out.println("Using item:" + itemList.getElementAt(index).getName());

			//To print to log
			logData = "Using item:" + itemList.getElementAt(index).getName();
		}
		else {
			JOptionPane.showMessageDialog(null, "Please select an item in the list", "No item selected!", 2);
			//To print log
			logData = "No item selected!";
		}

		//Sends the string to log to be printed
		InputLogger.LOGGER.log(logData);

	}

	public void setButton(JList<Items> theList) {
		myList = theList;
	}
	public JList<Items> getList() {
		return myList;
	}
}