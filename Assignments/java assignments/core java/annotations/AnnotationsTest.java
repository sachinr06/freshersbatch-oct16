package com.training.annotations;
class Annotations
{

	public void foo()
	{
		
		System.out.println("Inside foo()");
	}
	
	
}


public class AnnotationsTest extends Annotations{
	
	@Override
	public void foo()
	{
		
		System.out.println("Inside foo()");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
		
	}

}
