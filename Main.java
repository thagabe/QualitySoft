public class Tester {

	public static void main(String[] args) {
		MyContactList list1 = new MyContactList();
		list1.newContact("Alex", "Lui", "1729 Madras st", "alex.lui@gmail.com", "664-543-4122", "Manager");
		list1.newContact("Gabe", "Rodriguez", "1623 Van Halen Rd", "g.rodriguez@gmail.com", "650-456-7890", "Coder");
		list1.sortArray();
		for (Contact i : list1.getArrayListForPrint()) {
			System.out.println(i.toString());
		}

		for (Contact j : list1.searchArray("Lui")) {
			System.out.println(j.toString());
		}
	}

}
/** Feedback from Alex 
 * This class is a work in progress, we still need to take care of file input and output.
 * Since we are printing our contacts in a table, we must also print column names in main
 * In the future I think this Tester class should have some other static methods that each
 * take care of a specific job such as printing, scanning, or reading. That way the main 
 * method doesn't look so clutered. Also, lets rename the class from Tester to TestContactList
 * or something
 * **/
