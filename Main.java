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
