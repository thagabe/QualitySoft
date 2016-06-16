import java.io.Serializable;

/**
 * One Object of the class Contact represents one person's contact information
 */
@SuppressWarnings("serial")
public class Person implements Comparable<Person>, Serializable {

	private String firstName;
	private String lastName;
	private StreetAddress streetAddress;
	private String emailAddress;
	private String phoneNumber;
	private String notes;

	/**
	 * Sets private variables to default values GR,AK
	 */
	public Person() {
		firstName = "";
		lastName = "";
		streetAddress = new StreetAddress();
		emailAddress = "";
		phoneNumber = "";
		notes = "";
	}
	
	/**
	 * Sets private variable to passed arguments GR, AK
	 */ 
	public Person(String firstName, String lastName,
			StreetAddress streetAddress, String emailAddress,
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
	public int compareTo(Person o) {

		if (this.lastName.compareToIgnoreCase(o.lastName) < 0)
			return -1;
		else if (this.lastName.compareToIgnoreCase(o.lastName) > 0)
			return 1;
		else if (this.firstName.compareToIgnoreCase(o.firstName) < 0)
			return -1;
		else
			return 1;
	}

	/**
	 * Returns formatted string displaying all characteristics of Contact, GR,
	 * AK
	 */
	public String toString() {

		StringBuffer buffer = new StringBuffer();
		if (!firstName.isEmpty())
			buffer.append("\n\tFirst Name:\t" + firstName + "\n");

		if (!lastName.isEmpty())
			buffer.append("\tLast Name:\t" + lastName + "\n");

		if (!streetAddress.toString().isEmpty())
			buffer.append("\tStreet Address:\t" + streetAddress.toString()
					+ "\n");

		if (!emailAddress.isEmpty())
			buffer.append("\tEmail Address:\t" + emailAddress + "\n");

		if (!phoneNumber.isEmpty())
			buffer.append("\tPhone Number:\t" + phoneNumber + "\n");

		if (!notes.isEmpty())
			buffer.append("\tNotes:\t\t" + notes + "\n\n");
		return buffer.toString();
	}

}
/**
 * Feedback from Alex (6/9/17) At line 148, you don't need to print out 2 new
 * lines, this ended up making our toString() MyContactList look too spaced.
 * Also, for the second constructor, I don't like the idea of using the set
 * methods to assign the varibles. The constructor has access to this class's
 * private data. The set methods are meant to be used from outside this class.
 * **/
/**
 * Feedback from Adina The definition of this class is organized, clear, and
 * works correctly. I created the class to test it and to check that tabs do
 * what we're hoping. The output: Ann Green 123 main St 12345678 ann@gmail.com
 * ann is cool
 **/
