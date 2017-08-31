package collectionpackage;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//Add elements to ArrayList object
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator<String> i=list.iterator();
		System.out.println(" ARRAY LIST ");
        while(i.hasNext()){
          System.out.println("ELEMENT : "+i.next());
        }
		Collections.reverse(list);
		Iterator<String> i2=list.iterator();
		System.out.println(" REVERSE ARRAY LIST ");
        while(i2.hasNext()){
          System.out.println("ELEMENT : "+i2.next());
        }
	}

}
