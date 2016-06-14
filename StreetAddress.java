import java.io.Serializable;

/**
 * Class StreetAddress This class represents one street address object, it has
 * fields that specify a person's home address. It has getters, setters, and a
 * toString method, AL
 * **/
@SuppressWarnings("serial")
public class StreetAddress implements Serializable {

	private String streetNumber;
	private String streetName;
	private String cityName;
	private String stateName;
	private String zipCode;

	// constructors
	/**
	 * Default Constructor This sets all strings to empty, AL
	 * **/
	public StreetAddress() {
		this.streetNumber = "";
		this.streetName = "";
		this.cityName = "";
		this.stateName = "";
		this.zipCode = "";
	}

	/**
	 * Full Constructor This contains parameters for each varible in the class
	 * and assigns the class variables to their respective parameter. AL
	 * **/
	public StreetAddress(String streetNumber, String streetName,
			String cityName, String stateName, String zipCode) {

		this.streetNumber = streetNumber.trim();
		this.streetName = streetName.trim();
		this.cityName = cityName.trim();
		this.stateName = stateName.trim();
		this.zipCode = zipCode.trim();

	}

	// ACCESSORS
	/**
	 * returns streetNumber, AL.
	 * **/
	String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * returns streetName AL
	 * **/
	String getStreetName() {
		return streetName;
	}

	/**
	 * returns cityName, AL
	 * **/
	String getCityName() {
		return cityName;
	}

	/**
	 * returns stateName, AL
	 * **/
	String getStateName() {
		return stateName;
	}

	/**
	 * returns zipCode AL
	 * **/
	String getzipCode() {
		return zipCode;
	}

	// MUTATORS
	/**
	 * sets streetNumber to parameter, AL
	 * **/
	void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber.trim();

	}

	/**
	 * sets streetName to parameter, AL
	 * **/
	void setStreetName(String streetName) {
		this.streetName = streetName.trim();
	}

	/**
	 * sets cityName to parameter, AL
	 * **/
	void setCityName(String cityName) {
		this.cityName = cityName.trim();
	}

	/**
	 * sets stateName to parameter, AL
	 * **/
	void setStateName(String stateName) {
		this.stateName = stateName.trim();
	}

	/**
	 * sets zipCode to parameter, AL
	 * **/
	void setZipCode(String zipCode) {
		this.zipCode = zipCode.trim();
	}

	/**
	 * returns a string with all the information for a street address, AL
	 * **/
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		if (!this.streetNumber.isEmpty())
			buffer.append(this.streetNumber.trim() + " ");
		if (!this.streetName.isEmpty())
			buffer.append(this.streetName);
		if (!this.cityName.isEmpty())
			buffer.append(", " + this.cityName);
		if (!this.stateName.isEmpty())
			buffer.append(", " + this.stateName);
		if (!this.zipCode.isEmpty())
			buffer.append(", " + this.zipCode.trim());
		return buffer.toString();
	}
}
