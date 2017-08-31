package jdk8features;


public class MathOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation<Integer> addition = (Integer a, Integer b) -> { return a + b; };  
		int addResult=addition.operation(5,4);
		System.out.println(" ADDITION: "+addResult);
		MathOperation<Integer> subtraction = (Integer a, Integer b) -> { return a - b; };  
		int subResult=subtraction.operation(5,4);
		System.out.println(" SUB: "+subResult);
		MathOperation<Integer> multiplication = (Integer a, Integer b) -> { return a * b; };  
		int mulResult=multiplication.operation(5,4);
		System.out.println(" MUL : "+mulResult);
		MathOperation<Integer> division = (Integer a, Integer b) -> { return a / b; };  
		int divResult=division.operation(52,4);
		System.out.println(" DIV: "+divResult);
	}

}
