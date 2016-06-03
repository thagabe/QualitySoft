public class StreetAddress{
    String streetNumber;
    String streetName;
    String cityName;
    String stateName;
    String zipCode;
    
    //constructors
    public StreetAddress(){
    	this.streetNumber = null;
    	this.streetName = null;
    	this.cityName = null;
    	this.stateName = null;
    	this.zipCode = null;
    }
    public StreetAddress(String streetNumber, String streetName, String cityName, String stateName, String zipCode)  
    {                          
         
        this.streetNumber = streetNumber; 
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        
    }
    
    //accessors
    String getStreetNumber(){
          return streetNumber;
    }
    String getStreetName(){
          return streetName;
    }
    String getCityName(){
          return cityName;
    }
    String getStateName(){
          return stateName;
    }
    String getzipCode(){
          return zipCode;
    }
    
    //mutators
    void setStreetNumber(String streetNumber){
          this.streetNumber = streetNumber;
    }
    void setStreetName(String streetName){
          this.streetName = streetName;
    }
    void setCityName(String cityName){
          this.cityName = cityName;
    }
    void setStateName(String stateName){
          this.stateName = stateName;
    }
    void setZipCode(String zipCode){
          this.zipCode = zipCode;
    }
    
    //toString
    public String toString(){
    	StringBuffer buffer = new StringBuffer();
    	if(!this.streetNumber.isEmpty())
    		buffer.append(this.streetNumber.trim() + " ");
    	if(!this.streetName.isEmpty())
    		buffer.append(this.streetName.trim());
    	if(!this.cityName.isEmpty())
    		buffer.append(", " + this.cityName.trim());
    	if(!this.stateName.isEmpty())
    		buffer.append(", " + this.stateName.trim());
    	if(!this.zipCode.isEmpty())
    		buffer.append(", " + this.zipCode.trim());
    	return buffer.toString();
    }
}
