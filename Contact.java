/**
 * One Object of the class Contact represents one person's contact information
 */
public class Person {

	private String firstName;
	private String lastName;
	private StreetAddress streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * Sets private variables to passed arguments
	 */
	public Person(){
		firstName = "";
		lastName = "";
		streetAddress = new StreetAddress();
		emailAddress = "";
		phoneNumber = "";
		notes = "";
	}
	public Person(String firstName, String lastName, StreetAddress streetAddress, String emailAddress,
			String phoneNumber, String notes) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setStreetAddress(streetAddress);
		this.setEmailAddress(emailAddress);
		this.setPhoneNumber(phoneNumber);
		this.setNotes(notes);
	}

	/**
	 * Sets firstName to newFirstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName.trim();
	}

	/**
	 * Sets lastName to newFirstName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName.trim();
	}

	/**
	 * Sets streetName to newStreetName
	 */
	public void setStreetAddress(StreetAddress streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Sets emailAddress to newEmailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress.trim();
	}

	/**
	 * Sets phoneNumber to newPhoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber.trim();
	}

	/**
	 * Sets notes to newNotes
	 */
	public void setNotes(String notes) {
		this.notes = notes.trim();
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
		
		StringBuffer buffer = new StringBuffer();
		if(!firstName.isEmpty())
			buffer.append(firstName);
		buffer.append("\t\t\t");
		if(!lastName.isEmpty())
			buffer.append(lastName);
		buffer.append("\t\t\t");
		if(!streetAddress.toString().isEmpty())
			buffer.append(streetAddress.toString());
		buffer.append("\t\t\t\t");
		if(!emailAddress.isEmpty())
			buffer.append(emailAddress);
		buffer.append("\t\t\t");
		if(!phoneNumber.isEmpty())
			buffer.append(phoneNumber);
		buffer.append("\t\t\t");
		if(!notes.isEmpty())
			buffer.append(notes);
		return buffer.toString();
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
