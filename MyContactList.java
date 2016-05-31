import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList
/** One object of this class represents a list of contacts, **/
class MyContactList {
      private List<Contact> mainList; //this stores the list of contacts
      private File listFile; //this is a text file that stores all the contacts on the hard disk
      
      
      /**
        *The Contructor takes care of opening listFile (a text file) and loading all of the
        *contacts onto mainList
      **/
      public MyContactList(){
            mainList = new ArrayList<Contact>();
            listFile.open();
      }
      
      
      /**
       * This method is in charge of creating a new contact from its parameters and
       * adding them to the listFile
       **/
      public void newContact(String first, String last, String address, String email, String phone, String notes){
            
      }
      
      /** This method returns a string representing a table of all the contacts
       * **/
      public String fullList(){
            
      }
      
      /**
       * This method sorts the array from the contacts that are already present
       **/
      public void sort(){
            
      }
      
      
      /**
        * This method takes in a string which will represent a Contact's last name.
        * Then, this method finds all Contacts which have the string as a last name and 
        * appends them to a string and returns it. 
      **/
      public String search(String entry){  //This is the string used to search Contacts that have it as a last name
            String results; //this will be the string we append all the search results to 
            return results;
      }
      
      /**
        * This method takes care of all things that must be done before the program closes. It copies all the
        *current values of mainList to listFile and closes listFile.
      **/
      public void exit(){
            
      }
}
