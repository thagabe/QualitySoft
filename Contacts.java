import java.util.ArrayList;

public class Contacts {
	public Contacts newContact(){
		Contacts person = new Contacts();
		//takes in Strings with Scanner
		//At least lastName must be initialized
			//everything else can be initialized to 0/empty
		/*Post condition: New Person is stored in memory*/
		return person;
	}
	
	public ArrayList printContacts(ArrayList contactList){
		//Use of Sort() method[Private method]
		ArrayList contactListSorted; //Sort contactList
		//Prints all contacts to console or gui
			//For loop through all contacts and
			//Use of toString() for formatting [Private method]
		return contactListSorted;
	}
	
	public void searchByLasName(String sentLastName){
		//searchTerm = sentLastName.toLowerCase()
		//if(serachTerm not found)
		//   display[method] Error message (Use of toString)
		//else if (searchTerm found once)
		// display() all the info on that contact
		// else 
		//    display() all info of everyone 
	}
	
	private void toString(){
		//Layout of how the Contact's info should be displayed
	}
	
	private void toSort(ArrayList contactList){
		//Called as part of the printContacts
		//Looks through ArrayList and sorts based on:
			//All contacts must be .toLowerCase() or .ignoreCase()
			//First letter of last name in acending order
			//If the same lastName then use firstName to sort them
	}
	
	private void display(){
		//We use this as as the only method that writes to console or gui.
		//We might need arguments or instance variables depending on what we need
	}
	
	public void quitToDisk(ArrayList sortedContactList){
		//Use of printWrite() to save ArrayList to disk
		//exit(0)
	}
	
	public void openProgram(){
		//Read file API
		//Check if there is a list on memory
			//If yes then use it to recreate an arraylist
			//else create an empty arraylist
	}

}
