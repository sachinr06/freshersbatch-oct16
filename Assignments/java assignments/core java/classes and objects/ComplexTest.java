class ComplexNumber{

   private int real;
   private int imag;
 
 
 


  public void getNo()
  {
    System.out.println(this.real+"+"+this.imag+"i");
 
   }
   
    public String toString()
   {
	    return this.real+"+"+this.imag+"i";
	   
   }  


  public void setNo(int real,int imag)
   {
		this.real=real;
		this.imag=imag;
    
 
 }
 
 public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
 {
	 
		  ComplexNumber c3 =new ComplexNumber();
	 int realadd=c1.real+c2.real;
	 int imagadd=c1.imag+c2.imag;

	   c3.real=realadd;
	   c3.imag=imagadd;
	   return c3;
	
 }	 
 
 
  public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2)
 {
	  ComplexNumber c3 =new ComplexNumber();
	 int realadd=c1.real-c2.real;
	 int imagadd=c1.imag-c2.imag;
	
	c3.real=realadd;
	   c3.imag=imagadd;
	   return c3;
 }	 
 
   public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2)
 {
	  ComplexNumber c3 =new ComplexNumber();
	 int realadd=(c1.real*c2.real)-(c1.imag*c2.imag);
	 int imagadd=(c1.real*c2.imag)+(c1.imag*c2.real);
	
	   c3.real=realadd;
	   c3.imag=imagadd;
	   return c3;
 }	 
}


public class ComplexTest
{
	
 public static void main(String args[])
 {
	ComplexNumber c=new ComplexNumber();
	ComplexNumber c2=new ComplexNumber();

	c.setNo(3,2);
	//d.getDate();
	System.out.println("Number 1 :"+c);
	c2.setNo(1,4);
	System.out.println("Number2 :"+c2);
	//d2.getDate();
	ComplexNumber c3= new ComplexNumber();

	 c3=ComplexNumber.add(c,c2);
	 	System.out.println(c3);
		 c3=ComplexNumber.subtract(c,c2);
			System.out.println(c3);
		 c3=ComplexNumber.multiply(c,c2);
			System.out.println(c3);
	

 
 } 
}


