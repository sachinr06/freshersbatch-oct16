class Date{

   private int day;
    private int month;
    private int year;

	Date()
	{
		this.day=6;
		this.month=10;
		this.year=1995;
	}	

	Date(int day,int month,int year)
	{
		 this.day=day;
    this.month=month;
    this.year=year;
		
	}	

  public void getDate()
  {
    System.out.println("Date:"+this.day+"/"+this.month+"/"+this.year);
 
   }
   
   
   public String toString()
   {
	    return this.day+"/"+this.month+"/"+this.year;
	   
   }   


  public void setDate(int day,int month,int year)
   {
    this.day=day;
    this.month=month;
    this.year=year;
    
 }


 public static void swap(Date dt[])
  {
	  
		Date temp =dt[0];
		dt[0]=dt[1];
		dt[1]=temp;
		
   
  }


}



public class DateTest
{
	
 public static void main(String args[])
 {
	Date d[]=new Date[2];
     
	d[0] = new Date(6,10,1995);
	//d.getDate();
	System.out.println("Date 1 :"+d[0]);
	d[1] = new Date(28,10,1970);
	System.out.println("Date 2 :"+d[1]);
	//d2.getDate();
	
	System.out.println(" After Swapping");
	Date.swap(d);
	System.out.println("Date 1 :"+d[0]);
		System.out.println("Date 2 :"+d[1]);
 
 } 
}
	