import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



/** AL = Alex, GR = Gabe, AK = Adina
 * Creates object of class MyContactList, adds 2 contact to the list and prints them. GR, AK
 */
public class TestMyContactList {

	public static void main(String[] args) {
		MyContactList list = new MyContactList();
		list.addContact(promptUser());
		System.out.println(list.toString());
		list.addContact(promptUser()));
		System.out.println(list.toString());
	}
	
	//To use later
	/** promptUser() AL, AK
	 * This method takes care of all the user prompting and returns 
	 * a contact object containing all the information
	**/
	private static Person promptUser(){
		Person createContact = new Person();
		Scanner input = new Scanner(System.in);
		String command;
		//System.out.println("____________Enter Contact Prompt____________");
		System.out.print("Enter your first name: ");
		createContact.setFirstName(input.nextLine());
		
		do{
			command = "";
			System.out.print("Enter your last name: ");
			createContact.setLastName(input.nextLine());
			if(createContact.getLastName().isEmpty()){
				System.out.println("---You must enter in your last name---");
				while(!command.equals("q") && !command.equals("c")){
					System.out.print("Please enter 'q' to quit or 'c' to contine\nYour Choice: ");
					command = input.nextLine().trim();
					if(command.equals("q"))
						return createContact;
					else if(command.equals("c"))
						;
					else
						System.out.println("Command '" + command + "' not found");
				}
			}
		}while(createContact.getLastName().isEmpty());
		
		System.out.println("Street Address:");
		System.out.print("\t" + "Enter your street number: ");
		createContact.getStreetAddress().setStreetNumber(input.nextLine());
		System.out.print("\t" + "Enter your street name: ");
		createContact.getStreetAddress().setStreetName(input.nextLine());
		System.out.print("\t" + "Enter your city name: ");
		createContact.getStreetAddress().setCityName(input.nextLine());
		System.out.print("\t" + "Enter your state name: ");
		createContact.getStreetAddress().setStateName(input.nextLine());
		System.out.print("\t" + "Enter your zip code: ");
		createContact.getStreetAddress().setZipCode(input.nextLine());
		
		System.out.print("Enter your email address: ");
		createContact.setEmailAddress(input.nextLine());
		System.out.print("Enter your phone number: ");
		createContact.setPhoneNumber(input.nextLine());
		System.out.print("Enter any notes about this contact: ");
		createContact.setNotes(input.nextLine());
		System.out.println();
		return createContact;
	}
}

/* -------------------------------------RUN------------------------------------------------

Enter your first name: Richard
Enter your last name: Feynman
Street Address:
	Enter in your street number: 111
	Enter in your street name: N Rengstorff ave
	Enter in your city name: Mountain View
	Enter in your state name: CA
	Enter in your zip code: 94043
Enter your email address: rfeynman@gmail.com
Enter your phone number: 6505375080
Enter any notes about this contact: He is a physicist

First Name:
	Richard
Last Name:
	Feynman
Street Address:
	111 N Rengstorff ave, Mountain View, CA, 94043
Email Address:
	rfeynman@gmail.com
Phone Number:
	6505375080
Notes:
	He is a physicist

Enter your first name: Howard
Enter your last name: 
---You must enter in your last name---
Please enter 'q' to quit or 'c' to contine
Your Choice: c
Enter your last name: Aiken
Street Address:
	Enter in your street number: 575 
	Enter in your street name: Hawthorne ave
	Enter in your city name: Los Altos Hills
	Enter in your state name: CA
	Enter in your zip code: 94022
Enter your email address: aiken.howard@gmail.com
Enter your phone number: 6507873490
Enter any notes about this contact: He is cool

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	This method must return a result of type int

	at projectContact.Person.compareTo(Person.java:125)
	at projectContact.Person.compareTo(Person.java:1)
	at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:
320)
	at java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.util.Arrays.sort(Arrays.java:1312)
	at java.util.Arrays.sort(Arrays.java:1506)
	at java.util.ArrayList.sort(ArrayList.java:1454)
	at java.util.Collections.sort(Collections.java:141)
	at projectContact.MyContactList.sortArray(MyContactList.java:55)
	at projectContact.MyContactList.toString(MyContactList.java:39)
	at java.lang.String.valueOf(String.java:2994)
	at java.io.PrintStream.println(PrintStream.java:821)
	at projectContact.TestMyContactList.main(TestMyContactList.java:23)

---------------------------------------------------------------------------------------------- */
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
 * 
/** Feedback from Gabe to Adina
 * on TestMyContactList
 * 	Make Scanner private;
 * 	More descriptive object name;
 * 	I liked what you did when asking for last name, but i think the guideline wants us to just not add the contact if the
 * 	last name wasn't entered. Maybe add it as a helper method and use it if allowed?;
 * 	To both Alex + Adina: Does the use of the promptUser() method + the addContact(Contact person) makes the use of 
 * 	newContact(...) essentially useless? Should we get rid of newContact(...);
 * on Contact()
 * 	Instead of Assignments onthe constructor why don't we just call the setters thus minimizing code?
 * 	Do we need that many tabs?
 */
