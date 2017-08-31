package collectionpackage;

import java.util.*;

class NumberList{
	
		void printList(List<? extends Number> list) { 
		for (Object m: list) 
			System.out.println(m + " ");
		} 
	 
}

public class GenericNumberListTest {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(1);
		mylist.add(8);
		mylist.add(70);
		NumberList l=new NumberList();
		l.printList(mylist);
		
	}

}
