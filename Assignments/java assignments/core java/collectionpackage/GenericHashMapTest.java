package collectionpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HashMapGeneric{
	
	void printMapKeyValues(Map<? extends Number, ?> map)  { 
	for (Object m: map.keySet()) 
		System.out.println(m + " ");
	} 
 
}

public class GenericHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "ABC");
		hmap.put(2, "PQR");
		hmap.put(3, "XYZ");
		HashMapGeneric h=new HashMapGeneric();
		h.printMapKeyValues(hmap);
	}

}
