package jdk8features;

import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.*;

public class UrnaryOperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		List<String> list =new ArrayList<String>();
		list.add("Search");
		list.add("Array");
		list.add("Counter");
		list.add("Heading");
		list.add("Inferface");
		list.add("Nodes");
		
		 UnaryOperator<List<String>> u=(List<String> a)->{
			 for(String x:a){
			 Collections.replaceAll(a,x, x.toUpperCase());
			 
			 }
			 return a;
		 };
		 
		 List<String> a=u.apply(list);
		 for(String x:a){
			 System.out.println(x);
		 }
		 
	}

}
