import java.util.List;
import java.util.ArrayList;

/**
 * One object of this class represents an ArrayList containing Objects of class
 * Contact.
 */
class MyContactList {

	private List<Contact> mainList; // this stores the list of contacts

	/**
	 * The Constructor takes care of initializing the ArrayList when this object
	 * is instantiated.
	 */
	public MyContactList() {
		mainList = new ArrayList<Contact>();
	}

	/**
	 * This method is in charge of creating a new contact from its parameters
	 * and adding them to the listFile. Checks if at least last name is present
	 * otherwise it returns false and does not set anything.
	 */
	public boolean newContact(String first, String last, String address, String email, String phone, String notes) {
		if (last != "") {
			Contact person = new Contact(first, last, address, email, phone, notes);
			mainList.add(person);
			return true;
		} else
			return false;
	}

	/**
	 * This method calls sortArray() then returns the ArrayList.
	 **/
	public List<Contact> getArrayListForPrint() {
		// sortArray();
		return mainList;
	}

	/**
	 * This method sorts the ArrayList based on the last name in alphabetical
	 * order from the contacts that are already present in the List, if two
	 * Contact objects share the same last name then sortArray() will arrange
	 * them based on alphabetical order on the first names.
	 */
	private void sortArray() {
	}

	/**
	 * This method takes in a String which contains the last name to lookup in
	 * the ArrayList. If an occurrence of the String is encountered it will
	 * return a new ArrayList with the object(s) appended to this new ArrayList.
	 */
	public List<Contact> searchArray(String searchLastName) {
		// Ignore Case!
		List<Contact> lookUpList = new ArrayList<Contact>();
		return lookUpList;
	}

}

/** Feedback from Alex
 * I think this is very good, I like the way we renamed the methods to describe
 * what they are doing. In the future, I think sortArray() should be private, so that
 * users of this class don't always have to call it before printing the contact list.
 * 
 * **/
 
 /** Feddback from Adina
  * Use toString() method instead of getArrayListForPrint() to avoid giving the main() the private data structure since it can destroy it
  * as our director noted.
  * /
