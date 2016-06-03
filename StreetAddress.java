public class StreetAddress{
    
        String streetNumber;
        String streetName;
        String cityName;
        String stateName;
        String zipCode;
    
    //constructors
    public StreetAddress(){
    	this.streetNumber = "";
    	this.streetName = "";
    	this.cityName = "";
    	this.stateName = "";
    	this.zipCode = "";
    }
    public StreetAddress(String streetNumber, String streetName, String cityName, String stateName, String zipCode)  
    {                          
         
        this.streetNumber = streetNumber.trim(); 
        this.streetName = streetName.trim();
        this.cityName = cityName.trim();
        this.stateName = stateName.trim();
        this.zipCode = zipCode.trim();
        
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
          this.streetNumber = streetNumber.trim();
          
    }
    void setStreetName(String streetName){
          this.streetName = streetName.trim();
    }
    void setCityName(String cityName){
          this.cityName = cityName.trim();
    }
    void setStateName(String stateName){
          this.stateName = stateName.trim();
    }
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
