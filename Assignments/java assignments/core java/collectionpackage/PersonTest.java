package collectionpackage;
import java.util.*;

class Person implements Comparable<Person>{
	
	String name;
	double weight;
	double height;
	
	Person(String name,double weight,double height)
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
		
	
	}
	
	void getinfo(){
		System.out.println("");
		System.out.println(" Name : "+this.name);
		System.out.println(" Weight : "+this.weight);
		System.out.println(" Height : "+this.height);
	}
	
	public int compareTo(Person p1){  
		if(this.weight==p1.weight)  
		{
			if(this.height==p1.height)  
				return 0;  
				else if(this.height>p1.height)  
				return 1;  
				else  
				return -1;  
			
		}
		else if(this.weight>p1.weight)  
		return 1;  
		else  
		return -1;  
	
	
}
	
}


public class PersonTest {

	public static void main(String[] args) {
		
		 TreeSet<Person> tset=new TreeSet<Person>();  
		 Person p1=new Person("Sachin",71.5,80);
		 Person p2=new Person("Gopal",80.5,75);
		 Person p3=new Person("Aniket",63.5,85);
		 Person p4=new Person("Swapnil",80.5,76);
		 tset.add(p1);
		 tset.add(p2);
		 tset.add(p3);
		 tset.add(p4);
         Iterator<Person> i=tset.iterator();
         while(i.hasNext()){
           i.next().getinfo();
         }
	}

}
