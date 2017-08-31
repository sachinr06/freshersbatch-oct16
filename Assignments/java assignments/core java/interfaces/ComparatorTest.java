import java.util.*; 
class Person{

String name;
int height;
int weight;
Person(String name,int height,int weight)
{
this.name=name;
this.height=height;
this.weight=weight;
}

void print()
{
 System.out.println(this.name+" has height "+this.height+" & weight "+this.weight);

}
}

class NameComparator implements Comparator<Person>{  
public int compare(Person p1,Person p2){  
return p1.name.compareTo(p2.name);   
}  
} 

class HeightComparator implements Comparator<Person>{  
public int compare(Person p1,Person p2){  
if(p1.height==p2.height)  
return 0;  
else if(p1.height>p2.height)  
return 1;  
else  
return -1;  
}  
} 

class WeightComparator implements Comparator<Person>{  
public int compare(Person p1,Person p2){  
if(p1.weight==p2.weight)  
return 0;  
else if(p1.weight>p2.weight)  
return 1;  
else  
return -1;  
}  
} 


public class ComparatorTest{
 
public static void main(String args[])
{
 Person p[]=new Person[5];
 p[0]=new Person("Sachin",70,70);
 p[1]=new Person("Aniket",71,45);
 p[2]=new Person("Gopal",69,75);
 p[3]=new Person("Swapnil",68,80);
 p[4]=new Person("Bhuvi",65,60);
  for(int i=0;i<p.length;i++)
     p[i].print();
	
 WeightComparator w =new WeightComparator();
 NameComparator n=new NameComparator();
 HeightComparator h=new HeightComparator();
 System.out.println(" Sorting By name");
  System.out.println("              ");
	Arrays.sort(p,n);  
	 for(int i=0;i<p.length;i++)
     p[i].print();
 System.out.println("              ");
 System.out.println("              ");
 	System.out.println(" Sorting By height");
  System.out.println("              ");
	Arrays.sort(p,h);  
	 for(int i=0;i<p.length;i++)
     p[i].print();
 System.out.println("              ");
 System.out.println("              ");
  System.out.println(" Sorting By weight");
  System.out.println("              ");
	Arrays.sort(p,w);  
	 for(int i=0;i<p.length;i++)
     p[i].print();
	System.out.println("              ");
	System.out.println("              ");
	System.out.println(" Sorting By height");
  System.out.println("              ");
	Arrays.sort(p,h);  
	 for(int i=0;i<p.length;i++)
     p[i].print();

}

}