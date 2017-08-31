class Queue
{

	   final int MAX=10;
		
		int [ ] Queue= new int [MAX]; 
	    int  rear=-1;
		int  front=-1;

		public void insert( int element)
		{
		
		   if(rear==MAX-1)
		   {
		   System.out.println("Queue is Full");
		   
		   
		   }
		   
		   else
			  if(rear==-1)
			  {
				  front=0;
				  rear=0;
				    Queue[rear]= element;
				  
			  }
			  else
				{
		   
				rear=rear+1;
		        Queue[rear]= element;
		   
				}
		
		
		
		}

		
		 public void delete()
		 {
		   if(front==-1)
		      System.out.println("Queue is Empty");
			  
			else
			{
			
			System.out.println("Deleted Element is :"+Queue[front]);
			front++;
			  
			
			}
		 
		 
		 }
		 
		 public void show()
		 {
		  
		  for(int i=front;i<=rear;i++)
		  {
		  System.out.println(Queue[i]);
		  
		  }
		 
		 
		 }





}





public class QueueTest
{


  public static void main(String args[])
  {
   
   Queue Q= new Queue();
   Q.delete();
   Q.insert(4);
   Q.insert(7);
   Q.insert(8);
   Q.show();
   Q.delete();
   Q.show();
  
  }
}