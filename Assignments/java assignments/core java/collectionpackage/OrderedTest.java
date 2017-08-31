package collectionpackage;

import java.util.*;

public class OrderedTest {
	public static void main(String[] args) {
		HashSet<String> hset =new HashSet<String>();
		hset.add("XYZ");
		hset.add("ABC");
		hset.add("PQR");
		Iterator<String> i=hset.iterator();
		System.out.println(" HASH SET");
        while(i.hasNext()){
          System.out.println("ELEMENT : "+i.next());
	}
    	System.out.println("");
        
        LinkedHashSet<String> lset =new LinkedHashSet<String>();     
        lset.add("XYZ");
		lset.add("ABC");
		lset.add("PQR");
		Iterator<String> i2=lset.iterator();
		System.out.println("Linked HASH SET");
        while(i2.hasNext()){
          System.out.println("ELEMENT : "+i2.next());
}
}
}