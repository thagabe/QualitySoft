/**
 * This Class tests our other 2 Classes [Contacts, MyContactList] by calling all
 * public methods on those Classes and (for the ones that return) will print output.
 */
public class TestMyContactList {

	public static void main(String[] args) {
		// Two objects defined and initialized
		MyContactList list1 = new MyContactList();
		Contact myContact = new Contact("", "", "", "", "", "");
		
		// Calling all methods from Class MyContactList 
		if(list1.newContact("Alex", "Lui", "1729 Madras st", "alex.lui@gmail.com", "664-543-4122", "Manager"))
			System.out.println("Contact Created Successfully!\n");
		else
			System.out.println("You have not entered a Last Name, which is required\n");
		System.out.println("Should print out ContactList: \n" + list1);
		System.out.println("Should print contact(s) if found [empty string for now]: " + list1.searchArray("Lui"));
		
		
		System.out.println("\n------------------------------------\n");
		
		// Calling all methods from Class Contact
		myContact.setFirstName("Gabe");
		myContact.setLastName("Rodriguez");
		myContact.setStreetAddress("1623 Van Halen Rd");
		myContact.setEmailAddress("g.rodriguez@gmail.com");
		myContact.setPhoneNumber("650-123-4567");
		myContact.setNotes("Programmer");
		System.out.printf("First Name: %s Last Name: %s Street: %s Email: %s Phone: %s Notes: %s\n",
				myContact.getFirstName(), myContact.getLastName(), myContact.getStreetAddress(),
				myContact.getEmailAddress(), myContact.getPhoneNumber(), myContact.getNotes());
		System.out.println();
		System.out.println(myContact);
	}
	private static Contact promptUser(){
		Contact createContact = new Contact();
		Scanner input = new Scanner(System.in);
		
		System.out.println("____________Enter Contact Prompt____________");
		System.out.print("Enter your first name: ");
		createContact.setFirstName(input.nextLine());
		
		do{
			System.out.print("Enter your last name: ");
			createContact.setLastName(input.nextLine());
			if(createContact.getLastName().isEmpty())
				System.out.println("---You must enter in your last name---");
		}while(createContact.getLastName().isEmpty());
		
		System.out.println("Street Address:");
		System.out.print("\t" + "Enter in your Street Number: ");
		createContact.getStreetAddress().setStreetNumber(input.nextLine());
		System.out.print("\t" + "Enter in your Street Name: ");
		createContact.getStreetAddress().setStreetName(input.nextLine());
		System.out.print("\t" + "Enter in your City Name: ");
		createContact.getStreetAddress().setCityName(input.nextLine());
		System.out.print("\t" + "Enter in your State Name: ");
		createContact.getStreetAddress().setStateName(input.nextLine());
		System.out.print("\t" + "Enter in your Zip Code: ");
		createContact.getStreetAddress().setZipCode(input.nextLine());
		
		System.out.print("Enter your email address: ");
		createContact.setEmailAddress(input.nextLine());
		System.out.print("Enter your phone number: ");
		createContact.setPhoneNumber(input.nextLine());
		System.out.print("Enter any notes about this contact: ");
		createContact.setNotes(input.nextLine());
		System.out.println("____________End Prompt____________\n\n");
		return createContact;
	}
}

/* --------------------------------------------------------------------------------------------------------------------------------
Contact Created Successfully!

Should print out ContactList: 
Alex	Lui	1729 Madras st	alex.lui@gmail.com	664-543-4122	Manager

Should print contact(s) if found [empty string for now]: 

------------------------------------

First Name: Gabe Last Name: Rodriguez Street: 1623 Van Halen Rd Email: g.rodriguez@gmail.com Phone: 650-123-4567 Notes: Programmer

Gabe	Rodriguez	1623 Van Halen Rd	g.rodriguez@gmail.com	650-123-4567	Programmer

--------------------------------------------------------------------------------------------------------------------------------- */
/** Feedback from Alex 
 * This class is a work in progress, we still need to take care of file input and output.
 * Since we are printing our contacts in a table, we must also print column names in main
 * In the future I think this Tester class should have some other static methods that each
 * take care of a specific job such as printing, scanning, or reading. That way the main 
 * method doesn't look so clutered. Also, lets rename the class from Tester to TestContactList
 * or something
 * **/
 
/** Feedback from Adina
 * Change the name of the class so that it matches the name of the .java file. Or, as Alex said, it would be even better to call
 * the file TestMyContactList.java and call class TestMyContactList. I believe this would be more descriptive.
 * Write JavaDoc format comments above this class that should start "This class tests..."
 * Create an object of EACH class (both class Contact and class MyContactList) and call EACH method on these objects.
 * COPY AND PASTE recording of run.
 * /