import java.util.*; 
class Person implements Comparable<Person>{

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
public int compareTo(Person p1){  
if(this.height==p1.height)  
return 0;  
else if(this.height>p1.height)  
return 1;  
else  
return -1;  
}  
}








public class ComparableTest{
 
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
	


 	System.out.println(" Sorting By height");
  System.out.println("              ");
	Arrays.sort(p);  
	 for(int i=0;i<p.length;i++)
     p[i].print();


}

}