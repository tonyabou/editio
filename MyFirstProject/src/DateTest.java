
import java.util.*;

public class DateTest {
	public static void main(String[] args) {

		// Create an array list. Git repository. changes from the source
		 ArrayList<String> al = new ArrayList<String>();
		 // Add elements to the array list.
		 al.add("C");
		 al.add("A");
		 al.add("E");
		 al.add("B");
		 al.add("D");
		 al.add("F");
		 // Use iterator to display contents of al.
		 System.out.print("Original contents of al: ");
		 Iterator<String> itr = al.iterator();
		 while(itr.hasNext()) {
		 String element = itr.next();
		 element+="XX";
		 
		 }
		 
		 itr = al.iterator();
		 while(itr.hasNext()) {
			 String element = itr.next();
			
			 System.out.print(element + " ");
			 }
		 System.out.println();

	}

}
