/**
 * One Object of the class Contact represents one person's contact information
 */
public class Contact {

	private String firstName;
	private String lastName;
	private StreetAddress streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * Sets private variables to passed arguments
	 */
	public Contact(String newFirstName, String newLastName, StreetAddress newStreetAddress, String newEmailAddress,
			String newPhoneNumber, String newNotes) {
		firstName = newFirstName;
		lastName = newLastName;
		streetAddress = newStreetAddress;
		emailAddress = newEmailAddress;
		phoneNumber = newPhoneNumber;
		notes = newNotes;
	}

	/**
	 * Sets firstName to newFirstName
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Sets lastName to newFirstName
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Sets streetName to newStreetName
	 */
	public void setStreetAddress(StreetAddress newStreetAddress) {
		streetAddress = newStreetAddress;
	}

	/**
	 * Sets emailAddress to newEmailAddress
	 */
	public void setEmailAddress(String newEmailAddress) {
		emailAddress = newEmailAddress;
	}

	/**
	 * Sets phoneNumber to newPhoneNumber
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		phoneNumber = newPhoneNumber;
	}

	/**
	 * Sets notes to newNotes
	 */
	public void setNotes(String newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns value of firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns value of lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Returns value of streetAddress
	 */
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Returns value of emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Returns value of phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Returns value of notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * Returns formatted string displaying all characteristics of Contact
	 */
	public String toString() {
		return (firstName + "\t" + lastName + "\t" + streetAddress.toString() + "\t" + emailAddress + "\t"
				+ phoneNumber + "\t" + notes);
	}

}
/** Feedback from Alex
 * I think this class is well done, it specifies what one object of this class
 * represents, has a constructor for each variable along with accessors and mutators.
 * In the future we will need to implement comparable so we can sort lists of these objects.
 * LEts hope the \t tabs do what we're hoping. There are some formatting classes java
 * has that we might be able to use
 * **/
/** Feedback from Adina
 * The definition of this class is organized, clear, and works correctly. I created the class to test it and to check that tabs do what 
 * we're hoping. The output:
 * Ann			Green			123 main St			12345678			ann@gmail.com			ann is cool
 * /
