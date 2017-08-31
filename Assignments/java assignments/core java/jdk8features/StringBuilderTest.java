package jdk8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StringBuilder> list =new ArrayList<StringBuilder>();
		list.add(new StringBuilder("Search"));
		list.add(new StringBuilder("Array"));
		list.add(new StringBuilder("Counter"));
		list.add(new StringBuilder("Heading"));
		list.add(new StringBuilder("Inferface"));
		list.add(new StringBuilder("Nodes"));
		Consumer<List<StringBuilder>> consumer =   (List<StringBuilder> x)->{
			StringBuilder a=new StringBuilder("");
			for(StringBuilder y:x){
				 a.append(y.charAt(0));
				
			}
			System.out.println("RESULTANT STRING : "+a);
		};
		
			consumer.accept(list);
		
	}

}
