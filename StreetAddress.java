class StreetAddress{
      int streetNumber;
      String streetName;
      String cityName;
      String stateName;
      int zipCode;
      
      //constructor
      public StreetAddress()  
      {                          
            //for ints, set default to -1, lets users know that field is empty
            //for Strings, set default to NULL, lets users know that field is empty
          streetNumber = -1;  
          streetName = NULL;
          cityName = NULL;
          stateName = NULL;
          zipCode = -1;
          
      }
      
      //accessors
      int getStreetNumber(){
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
      int getzipCode(){
            return zipCode;
      }
      
      //mutators
      void setStreetNumber(int streetNumber){
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
      void setzipCode(int zipCode){
            this.zipCode = zipCode;
      }
}
