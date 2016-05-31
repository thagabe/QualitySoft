import java.util.ArrayList;
/**
 * One Object of the class Contact represents one person's contact information
 **/
public class Contact {
	
	private String firstName;
	private String lastName; 
	private String streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;
	
	/**
	 * Set private variables to default values
	 **/
	public Contact(){
		firstName = "";
		firstName = "";
		streetAddress = "";
		emailAddress = "";
		phoneNumber = "";
		notes = "";
		
	}
	
	/**
	 * Sets private variables to passed arguments 
	 **/
	public Contact(String newFirstName, String newLastName, String newStreetAddress, String newEmailAddress, String newPhoneNumber, String newNotes){
		firstName = newFirstName;
		lastName = newLastName;
		streetAddress = newStreetAddress;
		emailAddress = newEmailAddress;
		phoneNumber = newPhoneNumber;
		notes = newNotes;
	}
	
	/**
	 * Sets firstName to newFirstName
	 **/
	public void setFirstName(String newFirstName) { firstName = newFirstName; }
	/**
	 * Sets lastName to newFirstName
	 **/
	public void setLastName(String newLastName){ lastName = newLastName; }
	/**
	 * Sets streetName to newStreetName
	 **/
	public void setStreetAddress(String newStreetAddress){ streetName = newStreetName; }
	/**
	 * Sets emailAddress to newEmailAddress
	 **/
	public void setEmailAddress(String newEmailAddress){ emailAddress = newEmailAddress; }
	/**
	 * Sets phoneNumber to newPhoneNumber
	 **/
	public void setPhoneNumber(String newPhoneNumber){ phoneNumber = newPhoneNumber; }
	/**
	 * Sets notes to newNotes
	 **/
	public void setNotes(String newNotes){ notes = newNotes; }
	
	/**
	 * Returns value of firstName
	 **/
	public String getFirstName() { return firstName; }
	/**
	 * Returns value of lastName
	 **/
	public String getLastName() { return lastName; }
	/**
	 * Returns value of streetAddress
	 **/
	public String getStreetAddress() { return streetAddress; }
	/**
	 * Returns value of emailAddress
	 **/
	public String getEmailAddress() { return emailAddress; }
	/**
	 * Returns value of phoneNumber
	 **/
	public String getPhoneNumber() { return phoneNumber; }
	/**
	 * Returns value of notes
	 **/
	public String getNotes() { return notes; }

	/**
	 * Returns formatted string displaying all characteristics of Contact
	 **/
	private String toString(){
		return (firstName + "\t\t\t" + lastName + "\t\t\t" + streetAddress + "\t\t\t" + emailAddress + 
		"\t\t\t" + phoneNumber + "\t\t\t" + notes);
	}


}
