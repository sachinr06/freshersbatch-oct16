package jdk8features;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		Function<Integer,String> function = (Integer marks)->marks > 40 ? "PASS" : "FAILED";
		System.out.println("Result = " + function.apply(45));
		System.out.println("Result = " + function.apply(23)); 
	}

}
