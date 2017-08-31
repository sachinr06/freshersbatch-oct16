package jdk8features;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.*;
public class RemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=new CopyOnWriteArrayList<String>();
		words.add("Sachin");
		words.add("Gopal");
		words.add("Aniket");
		words.add("Swapnil");
		Predicate<String> wordpredicate =   (String oo)->oo.length()%2!=0; 
	
		List<String> evenwords=new CopyOnWriteArrayList<String>();

		words.removeIf(wordpredicate);
		for(String x:words)
		System.out.println(x);
	

	}
}
