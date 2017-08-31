package collectionpackage;
import java.util.*;
import java.util.Map.Entry;
class Employee{
	
	 public int hashCode() {
	  return 55;
	 }
	 
	 
	 public boolean equals(Employee e){
		 return true;
	 }
}
public class CustomOverrides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		HashMap<String,Employee> hmap=new HashMap<String,Employee>();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		hmap.put("A",e1);
		hmap.put("B",e2);
		hmap.put("C",e3);
		Iterator<Entry<String, Employee>> i=hmap.entrySet().iterator();
		System.out.println(" HASH MAP");
        while(i.hasNext()){
          System.out.println("ELEMENT : "+i.next());
	}

}
}