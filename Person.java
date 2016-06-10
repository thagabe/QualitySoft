import java.io.Serializable;
/**
 * One Object of the class Contact represents one person's contact information
 */
public class Person implements Comparable<Person>,Serializable {

	private String firstName;
	private String lastName;
	private StreetAddress streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * Sets private variables to passed arguments GR,AK
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
	 * Sets firstName to newFirstName GR,AK
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName.trim();
	}

	/**
	 * Sets lastName to newFirstName GR,AK
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName.trim();
	}

	/**
	 * Sets streetName to newStreetName GR,AK
	 */
	public void setStreetAddress(StreetAddress streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * Sets emailAddress to newEmailAddress GR,AK
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress.trim();
	}

	/**
	 * Sets phoneNumber to newPhoneNumber GR,AK
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber.trim();
	}

	/**
	 * Sets notes to newNotes GR,AK
	 */
	public void setNotes(String notes) {
		this.notes = notes.trim();
	}

	/**
	 * Returns value of firstName GR,AK
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns value of lastName GR,AK
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Returns value of streetAddress GR, AK
	 */
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}

	/**
	 * Returns value of emailAddress, GR, AK
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Returns value of phoneNumber, GR, AK
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Returns value of notes, GR, AK
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * Returns 1, or -1 based on whether this's last name or o's last name comes
	 * first alphabetically
	 * **/
	public int compareTo(Person o){
		//return 1 of this.lastName > o.lastName
		//return -1 of this.lastName < o.lastName
		//else
			//compare firstName
	}
	/**
	 * Returns formatted string displaying all characteristics of Contact, GR, AK
	 */
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		if(!firstName.isEmpty())
			buffer.append("First Name:\t" + firstName + "\n");
		
		if(!lastName.isEmpty())
			buffer.append("Last Name:\t" + lastName + "\n");
		
		if(!streetAddress.toString().isEmpty())
			buffer.append("Street Address:\t" + streetAddress.toString() + "\n");
		
		if(!emailAddress.isEmpty())
			buffer.append("Email Address:\t" + emailAddress + "\n");
		
		if(!phoneNumber.isEmpty())
			buffer.append("Phone Number:\t" + phoneNumber + "\n");
		
		if(!notes.isEmpty())
			buffer.append("Notes:\t\t" + notes + "\n\n");
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
