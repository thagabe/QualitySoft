class StreetAddress{
      int streetNumber;
      String streetName;
      String cityName;
      String stateName;
      int zipCode;
      
      //constructor
      public StreetAddress()
      {
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
