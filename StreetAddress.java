
/** Class StreetAddress
 * This class represents one street address object, it has fields that specify
 * a person's home address. It has getters, setters, and a toString method
 * **/
public class StreetAddress{
    
        String streetNumber;
        String streetName;
        String cityName;
        String stateName;
        String zipCode;
    
    //constructors
    /** Default Constructor
     * This sets all strings to empty
     * **/
    public StreetAddress(){
    	this.streetNumber = "";
    	this.streetName = "";
    	this.cityName = "";
    	this.stateName = "";
    	this.zipCode = "";
    }
    /** Full Constructor
     * This contains parameters for each varible in the class and assigns the
     * class variables to their respective parameter
     * **/
    public StreetAddress(String streetNumber, String streetName, String cityName, String stateName, String zipCode)  
    {                          
         
        this.streetNumber = streetNumber.trim(); 
        this.streetName = streetName.trim();
        this.cityName = cityName.trim();
        this.stateName = stateName.trim();
        this.zipCode = zipCode.trim();
        
    }
    
    //ACCESSORS
    /**
     * returns streetNumber
     * **/
    String getStreetNumber(){
          return streetNumber;
    }
    /**
     * returns streetName
     * **/
    String getStreetName(){
          return streetName;
    }
    /**
     * returns cityName
     * **/
    String getCityName(){
          return cityName;
    }
    /**
     * returns stateName
     * **/
    String getStateName(){
          return stateName;
    }
    /**
     * returns zipCode
     * **/
    String getzipCode(){
          return zipCode;
    }
    
    //MUTATORS
    /**
     * sets streetNumber to parameter
     * **/
    void setStreetNumber(String streetNumber){
          this.streetNumber = streetNumber.trim();
          
    }
    /**
     * sets streetName to parameter
     * **/
    void setStreetName(String streetName){
          this.streetName = streetName.trim();
    }
    /**
     * sets cityName to parameter
     * **/
    void setCityName(String cityName){
          this.cityName = cityName.trim();
    }
    /**
     * sets stateName to parameter
     * **/
    void setStateName(String stateName){
          this.stateName = stateName.trim();
    }
    /**
     * sets zipCode to parameter
     * **/
    void setZipCode(String zipCode){
          this.zipCode = zipCode.trim();
    }
    
    //toString
    public String toString(){
    	StringBuffer buffer = new StringBuffer();
    	if(!this.streetNumber.isEmpty())
    		buffer.append(this.streetNumber.trim() + " ");
    	if(!this.streetName.isEmpty())
    		buffer.append(this.streetName);
    	if(!this.cityName.isEmpty())
    		buffer.append(", " + this.cityName);
    	if(!this.stateName.isEmpty())
    		buffer.append(", " + this.stateName);
    	if(!this.zipCode.isEmpty())
    		buffer.append(", " + this.zipCode.trim());
    	return buffer.toString();
    }
}
