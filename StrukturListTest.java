package s4Pertemuan6;

public class StrukturListTest {
	public static void main (String[] args) {
		//Create list
		StrukturList List = new StrukturList();
		
		List.addHead(4);
		List.addMiddle(3,2);
		List.addMiddle(7,3);
		List.addMiddle(8,4);
		List.addMiddle(1,5);
		List.addTail(9);
		List.displayElement();
		System.out.println("\n");
		List.removeAll();
		System.out.println("\n");
		//List.displayElement();
	}
}
