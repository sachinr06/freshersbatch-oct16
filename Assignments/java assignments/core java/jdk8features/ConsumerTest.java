package jdk8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Consumer<Integer> consumer =   (Integer x)->System.out.println(x);
		for(Integer x:list){
			consumer.accept(x);
		}
		
	}

}
