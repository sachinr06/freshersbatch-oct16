import java.util.*;
public class String2Test{
	
	
public static void main(String args[])
{
	
	
	String s=new String("ABC");
	String s2=s;
	s=s.concat("XYZ");
	
   StringBuffer s3=new StringBuffer("ABC");
	StringBuffer s4=s3;
	s3.append("XYZ");
	StringBuilder s5=new StringBuilder("ABC");
	StringBuilder s6=s5;
	s5.append("XYZ");

	
	
	boolean b=(s2==s);//False
	boolean b2=(s4==s3);//true
		boolean b3=(s6==s5);//true
		
	System.out.println(b);
	System.out.println(b2);
	System.out.println(b3);

	
}
		
	
	
	
}