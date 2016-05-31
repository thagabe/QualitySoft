import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList
/** One object of this class represents a list of contacts, **/
class MyContactList {
      private List<Contact> mainList = new ArrayList<Contact>(); //this stores the list of contacts
      File listFile; //this is a text file that stores all the contacts on the hard disk
      
      
      /**
        *The Contructor takes care of opening listFile (a text file) and loading all of the
        *contacts onto mainList
      **/
      public MyContactList(){
            
      }
      
      /**This method will be called by main. It will represent the main prompt where the user
      * can enter in what they would like to do (new contact, print, exit, search)
      * This method will then call newContact(), print(), exit() and search() accordingly
      **/
      public void run(){
            
      }
      /**
       * This method is in charge of creating a new contact by prompting the user for contact 
       * information, storing that information into a Contact object and adding that object to 
      * the mainList
      **/
      private void newContact(){
            
      }
      
      private void print(List<Contact> elements){
            //First, this method will sort mainList by last name and then by first name.
            //Then, print() will print all of the Contact objects from mainList to the standard output
            //formatted like a table by last name. 
      }
      
      /**
        * This method prompts the user for a string, "entry" which will represent a Contact's last name.
        * Then, this method then calls print() to print the results in a formatted table
      **/
      private void search(){
            String entry;     //This is the string used to search Contacts that have it as a last name
            List<Contacts> results;   
            
            this.print(results);
      }
      
      /**
        * This method takes care of all things that must be done before the program closes. It copies all the
        *current values of mainList to listFile and closes listFile.
      **/
      private void exit(){
            
      }
}
