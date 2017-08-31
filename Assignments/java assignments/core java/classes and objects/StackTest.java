class Stack
{

	   final int MAX=10;
		
		int [ ] Stack = new int [MAX]; 
	    int top =-1;

		public void push( int element)
		{
		
		   if(top==MAX-1)
		   {
		   System.out.println("Stack is Full");
		   
		   
		   }
		   
		   else
		   {
		   
				top=top+1;
		        Stack[top]= element;
		   
		   }
		
		
		
		}

		
		 public void pop()
		 {
		   if(top==-1)
		      System.out.println("Stack is Empty");
			  
			else
			{
			
			System.out.println("Deleted Element is :"+Stack[top]);
			  top=top-1;
			  
			
			}
		 
		 
		 }
		 
		 public void show()
		 {
		  
		  for(int i=0;i<Stack.length;i++)
		  {
		  System.out.println(Stack[i]);
		  
		  }
		 
		 
		 }





}





public class StackTest
{


  public static void main(String args[])
  {
   
   Stack S= new Stack();
   S.pop();
   S.push(1);
   S.show();
  
  }
}