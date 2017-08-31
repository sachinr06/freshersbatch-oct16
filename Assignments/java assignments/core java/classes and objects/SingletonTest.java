class First
{
	
	
  private static First s= new First();
  private First(){}
  
  public static First getInstance(){
   return s;
  }

   protected static void testmethod()
   {
	   	System.out.println(s);
     System.out.println(" Method of a Singleton Class");
   }

}



public class SingletonTest
{
  public static void main(String[] args) {
  
  
    First a= First.getInstance( );
    a.testmethod( );

	
	    First b= First.getInstance( );
    b.testmethod( );

		System.out.println(b);

}

}