import java.util.*; 

class Date implements  Cloneable{

   private int day;
    private int month;
    private int year;

	Date(int day,int month,int year)
	{
		 this.day=day;
    this.month=month;
    this.year=year;
		
	}	
	public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}
	
   public String toString()
   {
	    return this.day+"/"+this.month+"/"+this.year;
	   
   } 
}



class Person implements  Cloneable{

String name;
int height;
int weight;
Date dob;
Person(String name,int height,int weight,Date dob)
{
this.name=name;
this.height=height;
this.weight=weight;
this.dob=dob;
}

void print()
{
 System.out.println(this.name+" has height "+this.height+" & weight "+this.weight+" and was born on "+this.dob );

}

public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}


}








public class CloneTest{
 
public static void main(String args[])
{
	try
	{
	Date d=new Date(06,10,1995);
	Person p1=new Person("Sachin",70,71,d);
	Person p2=(Person)p1.clone();
	p1.print();
	p2.print();
	boolean b=(p1.name==p2.name);
	boolean a=(p1.dob==p2.dob);
	System.out.println("BOOLEAN VALUE :"+a);
	System.out.println("BOOLEAN VALUE :"+b);
	}
	
	catch(CloneNotSupportedException c){}  
	
 



}

}