package collectionpackage;

import java.util.HashMap;

class Date{
	int day;
	int month;
	int year;
	
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
		  public String toString()
		   {
			    return this.day+"/"+this.month+"/"+this.year;
			   
		   } 
	
		  @Override
			 public boolean equals(Object e){
			  Date e1=(Date) e;
				   if((this.day==e1.day)&&(this.month==e1.month)){
					   return true;
				   }
				   else 
					   
					   return false;
				 }
				 
				public int hashCode(){
				   return this.month+this.day;
					 }

			
			 }
	



	
	
	
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Date,String> hmap=new HashMap<Date,String>();
		Date d1=new Date(6,10,1995);
		Date d2=new Date(6,10,1982);
	
		hmap.put(d1,"Aniket");
		hmap.put(d2,"Sachin");
		//hmap.get(d2);
		System.out.println(hmap.get(d1));
	}
	

}
