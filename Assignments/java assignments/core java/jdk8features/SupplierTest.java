package jdk8features;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> supplier = () -> Math.random(); 
	 
		
		Double marks = supplier.get(); 
		System.out.println("Marks : "+marks);
		
	}

}
