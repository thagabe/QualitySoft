import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 * One object of this class represents an ArrayList containing Objects of class
 * Person. AL, GR
 */
public class MyContactList {

	private List<Person> contactList; // this stores the list of contacts

	/**
	 * The Constructor takes care of initializing the ArrayList when this object
	 * is instantiated.AL, GR
	 */
	public MyContactList() {
		contactList = new ArrayList<Person>();
	}

	/**
	 * This method is in charge of creating a new contact from its parameters
	 * and adding them to the listFile. Checks if at least last name is present
	 * otherwise it returns false and does not set anything.AL, GR
	 */
	public void addContact(Person person){
		if(!person.getLastName().trim().isEmpty())
			contactList.add(person);
	}

	/**
	 * This method calls sortArray(), then it will format the object's data to be returned to TestMyContactList.AL, GR
	 **/
	public String toString() {
		
		//System.out.println("-FIRST NAME-\t\t\t-LAST NAME-\t\t\t-STREETADDRESS-\t\t\t\t-EMAIL ADDRESS-\t\t\t-PHONE #-\t\t\t-NOTES-");
		sortArray();
		StringBuffer theFormat = new StringBuffer();
		for (Person element: contactList){
			theFormat.append(element.toString() + "\n");
		}
		return theFormat.toString();
	}
	
	/**
	 * This method sorts the ArrayList based on the last name in alphabetical
	 * order from the contacts that are already present in the List, if two
	 * Contact objects share the same last name then sortArray() will arrange
	 * them based on alphabetical order on the first names.AL, GR
	 */
	
	private void sortArray() {
		Collections.sort(contactList);
	}

	/**
	 * This method takes in a String which contains the last name to lookup in
	 * the ArrayList. If an occurrence of the String is encountered it will
	 * create a new ArrayList with the object(s) appended to this new ArrayList.
	 * It then returns a Formatted String with the objects' stored information.AL, GR
	 */
	public String searchContactByLastName(String searchLastName) {
		
		StringBuffer theFormat = new StringBuffer();
		sortArray();
		
		for(Person element: contactList){
			if(element.getLastName().equals(searchLastName)){
				theFormat.append(element.toString() + "\n");
			}
		}
		return theFormat.toString();
	}
}

/** Feedback from Alex
 * I think this is very good, I like the way we renamed the methods to describe
 * what they are doing. In the future, I think sortArray() should be private, so that
 * users of this class don't always have to call it before printing the contact list.AL, GR
 * 
 * **/
 
 /** Feddback from Adina
  * Use toString() method instead of getArrayListForPrint() to avoid giving the main() the private data structure since it can destroy it
  * as our director noted.
  * /
