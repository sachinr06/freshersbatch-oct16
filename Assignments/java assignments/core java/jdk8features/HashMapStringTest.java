package jdk8features;
import java.util.*;
import java.util.function.Function;

public class HashMapStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		hmap.put(1, 2);
		hmap.put(2, 3);
		hmap.put(3, 4);
		 Function<Map<Integer,Integer>,List<StringBuilder>> unar=(Map<Integer,Integer> a)->{
			 List<StringBuilder> list =new ArrayList<StringBuilder>();
			 for(Map.Entry<Integer,Integer> x:a.entrySet()){
				 StringBuilder str=new StringBuilder(x.getKey().toString());
				 StringBuilder str2=new StringBuilder(x.getValue().toString());
				 str.append(str2);
				 list.add(str);
			 }
			 return list;
		 };
		 
		 List<StringBuilder> arr=unar.apply(hmap);
		 for(StringBuilder x:arr){
			 System.out.println(x);
		 }
	}

}
