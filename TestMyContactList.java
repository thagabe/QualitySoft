import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * AL = Alex, GR = Gabe, AK = Adina 
 * Creates object of class MyContactList and manupilates with that object. GR, AK
 */
public class TestMyContactList {
	private static MyContactList theContactList;
	private static File listFile;

	private static FileOutputStream fileOut;
	private static ObjectOutputStream objectOut;
	private static FileInputStream fileIn;
	private static ObjectInputStream objectIn;

	public static void main(String[] args) throws ClassNotFoundException {
		listFile = new File("ContactList.ser");
		readExistingContactsFromDisk();
		char usersChoice = ' ';
		while (usersChoice != 'q') {
			usersChoice = showMenu();
			switch (usersChoice) {
			case 'n':
				// enter contact
				theContactList.addContact(promptUser());
				break;
			case 'p':
				// print contact list
				System.out.println(theContactList.toString());
				break;
			case 's':
				// search contact by last name
				searchContactPrompt();
				break;
			case 'q':
				saveContactsToDisk();
				break;
			default:
				System.out.println("****Error, " + usersChoice + " is not a recognized command.****");
				break;
			}
		}

	} // End Main

	/**
	 * AL, AK 
	 * Takes care of all the user prompting and
	 * returns a contact object containing all the information
	 **/
	private static Person promptUser() {
		Person createContact = new Person();
		Scanner input = new Scanner(System.in);
		String command;
		// System.out.println("____________Enter Contact Prompt____________");
		System.out.print("Enter first name: ");
		createContact.setFirstName(input.nextLine());

		do {
			command = "";
			System.out.print("Enter last name: ");
			createContact.setLastName(input.nextLine());
			if (createContact.getLastName().isEmpty()) {
				System.out.println("---You must enter in last name---");
				while (!command.equals("q") && !command.equals("c")) {
					System.out.print("Please enter 'q' to quit or 'c' to contine\nYour Choice: ");
					command = input.nextLine().trim();
					if (command.equals("q"))
						return createContact;
					else if (command.equals("c"))
						;
					else
						System.out.println("Command '" + command + "' not found");
				}
			}
		} while (createContact.getLastName().isEmpty());

		System.out.println("Street Address:");
		System.out.print("\t" + "Enter street number: ");
		createContact.getStreetAddress().setStreetNumber(input.nextLine());
		System.out.print("\t" + "Enter street name: ");
		createContact.getStreetAddress().setStreetName(input.nextLine());
		System.out.print("\t" + "Enter city name: ");
		createContact.getStreetAddress().setCityName(input.nextLine());
		System.out.print("\t" + "Enter state name: ");
		createContact.getStreetAddress().setStateName(input.nextLine());
		System.out.print("\t" + "Enter zip code: ");
		createContact.getStreetAddress().setZipCode(input.nextLine());

		System.out.print("Enter email address: ");
		createContact.setEmailAddress(input.nextLine());
		System.out.print("Enter phone number: ");
		createContact.setPhoneNumber(input.nextLine());
		System.out.print("Enter any notes about this contact: ");
		createContact.setNotes(input.nextLine());
		System.out.println();
		return createContact;
	}

	/**
	 * Prints menu, gets and returns user's choice 
	 * AK
	 */
	private static char showMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("**********MAIN MENU**********");
		System.out.println("Number of contacts in list: "); // number of contact
		System.out.println("Enter: ");
		System.out.println("- \"n\" to enter in a contact");
		System.out.println("- \"p\" to print the contact list");
		System.out.println("- \"s\" to search contacts by last name");
		System.out.println("- \"q\" to quit the program");
		System.out.print("Your choice: ");
		char choice = scan.next().charAt(0);
		String junk = scan.nextLine();
		return choice;
	}
	/**
	 * Reads data from file and prints how many contacts are in that file
	 * AK, AL
	 */
	private static void readExistingContactsFromDisk() {

		if (!listFile.exists()) {
			theContactList = new MyContactList();
			System.out.println("Zero contacts currently in list");
			return;
		}
		try {
			fileIn = new FileInputStream(listFile);
			objectIn = new ObjectInputStream(fileIn);
			theContactList = (MyContactList) objectIn.readObject();
			objectIn.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("MyContactList class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Number of Contacts in List: "
				+ theContactList.getListSize() + "\n");
	}
	/**
	 * Saves data to file and prints message saying that data is succesfully daved 
	 * AL, AK
	 */
	private static void saveContactsToDisk() {

		if (listFile.exists())
			listFile.delete();
		try {
			fileOut = new FileOutputStream(listFile);
			objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(theContactList);
			objectOut.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
		System.out.println("--Program Quitted. Contacts saved to disk--");
	}

	/**
	 * Prompts user for contact's last name to search for contact
	 * AL, GR
	 */
	private static void searchContactPrompt() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a last name: ");
		System.out.println(theContactList.searchContactByLastName(input
				.nextLine()));
		System.out.print("\nEnter any key to return to main menu...");
		input.nextLine();
		System.out.println();
	}
}

/*
 * -------------------------------------RUN--------------------------------------
 * ---------- Enter first name: Richard Enter last name: Feynman Street Address:
 * Enter street number: 111 Enter street name: Rengstorff Ave Enter city name:
 * Mountain View Enter state name: CA Enter zip code: 94043 Enter email address:
 * rfeynman@gmail.com Enter phone number: (650) 385-5839 Enter any notes about
 * this contact: He is a physicist __All Contacts__ First Name: Richard Last
 * Name: Feynman Street Address: 111 Rengstorff Ave, Mountain View, CA, 94043
 * Email Address: rfeynman@gmail.com Phone Number: (650) 385-5839 Notes: He is a
 * physicist Enter first name: Howard Enter last name: ---You must enter in last
 * name--- Please enter 'q' to quit or 'c' to contine Your Choice: c Enter last
 * name: Aiken Street Address: Enter street number: 575 Enter street name:
 * Hawthorne Ave Enter city name: Los Altos Hills Enter state name: Enter zip
 * code: Enter email address: aiken.howard@gmail.com Enter phone number: Enter
 * any notes about this contact: He is cool __All Contacts__ First Name: Richard
 * Last Name: Feynman Street Address: 111 Rengstorff Ave, Mountain View, CA,
 * 94043 Email Address: rfeynman@gmail.com Phone Number: (650) 385-5839 Notes:
 * He is a physicist First Name: Howard Last Name: Aiken Street Address: 575
 * Hawthorne Ave, Los Altos Hills Email Address: aiken.howard@gmail.com Notes:
 * He is cool
 * --------------------------------------------------------------------
 * --------------------------
 */
/**
 * Feedback from Alex This class is a work in progress, we still need to take
 * care of file input and output. Since we are printing our contacts in a table,
 * we must also print column names in main In the future I think this Tester
 * class should have some other static methods that each take care of a specific
 * job such as printing, scanning, or reading. That way the main method doesn't
 * look so clutered. Also, lets rename the class from Tester to TestContactList
 * or something
 * **/

/**
 * Feedback from Adina Change the name of the class so that it matches the name
 * of the .java file. Or, as Alex said, it would be even better to call the file
 * TestMyContactList.java and call class TestMyContactList. I believe this would
 * be more descriptive. Write JavaDoc format comments above this class that
 * should start "This class tests..." Create an object of EACH class (both class
 * Contact and class MyContactList) and call EACH method on these objects. COPY
 * AND PASTE recording of run. /
 * 
 * /** Feedback from Gabe to Adina on TestMyContactList Make Scanner private;
 * More descriptive object name; I liked what you did when asking for last name,
 * but i think the guideline wants us to just not add the contact if the last
 * name wasn't entered. Maybe add it as a helper method and use it if allowed?;
 * To both Alex + Adina: Does the use of the promptUser() method + the
 * addContact(Contact person) makes the use of newContact(...) essentially
 * useless? Should we get rid of newContact(...); on Contact() Instead of
 * Assignments onthe constructor why don't we just call the setters thus
 * minimizing code? Do we need that many tabs?
 **/
 
 /**
  * Feedback fro Adina to Alex:
  * Output does not match UI design, 
  * 1)the first line should say "-------------Print Contact List------------" 
  * 2)UI has ONE space(\n) above each printed contact, programs output does not have any before the first contact and has two between 
  * following contacts.
  * 3)When list is printed, program does not have "Press Enter to return to main prompt: " as UI design does.
  * 4)Also, Ui design and program output have different number of spaces between printed info. For exapmle, 
  * "First Name:	Howard" in program output lacks spaces
  * 
  * I tested the implementation of case 2 on my system and run I got is: 
  * 
  * __All Contacts__
	First Name:	Howard
	Last Name:	Aiken
	Street Address:	555 S Charleston, Los Alamos, CA, 98543
	Email Address:	aiken.howard@gmail.com
	Phone Number:	6509874567
	Notes:		he is a scientist


	First Name:	Ann
	Last Name:	Feynman
	Street Address:	111 N Rengstorff ave, Mountain View, CA, 94043
	Email Address:	feynman.ann@gmail.com
	Phone Number:	6505375084
	Notes:		cs2
	
	
	First Name:	Richard
	Last Name:	Feynman
	Street Address:	111 N Rengstorff ave, Mountain View, CA, 94043
	Email Address:	feynman.bob@gmail.com
	Phone Number:	6505375085
	Notes:		he is cool


	First Name:	John
	Last Name:	Nash
	Street Address:	435 Showers Dr, Los Angeles, CA, 95043
	Notes:		math

