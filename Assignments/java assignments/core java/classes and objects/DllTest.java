class Node
{
  Node prev;
 int data;
 Node next;
}

class MyDll
{
	Node head=null;
	Node p=null;
	Node trail=null;
	Node q=null ;
	Node temp=null;
	
	public Node addnode(int data)
	{
		Node n=new Node();
		n.data=data;
		n.prev=null;
		n.next=null;
		return n;
	 }		
	 
	 
	 public Node insert(int position,Node n)
	 {
		 
		 if(head==null)
		 {
			 head=n;
			 n=head;
			 return head;
			 
		 }
        else
			if(position==1)
			{
				head.prev=n;
				n.next=head;
				head=n;
				return head;
				
		    }
			
			
			else
			{
				p=head;
				int count=1;
			  while (p.next !=null )	
			  {
				  if(count==position-1)
					  break;
				  p=p.next;
				  count++;
				  
			  }	  
			  
			  if(p.next !=null)
			  {
				n.next=p.next;
				p.next=n;
				n.prev=(p.next).prev;
				
			 }
				else{
					
				p.next=n;
				n.prev=p;
				}
			
			 return head;
				
			}	
		
		 
	   	 
		 
	 }	 
	 
	 
	 
	 public Node delete( int position)
	 {
		 if(head==null)
		 {
			  System.out.println(" List is Empty Nothing to delete");
			  	 return head;
		 }
		 else
		 if(position==1)
		 {
			temp=head;
			head=head.next;
			 return head;
			 
		 }
		 
		 
		 else
		 {
			 p=head;
		
			 int count2=1;
			 while(p.next !=null )
		  {
				 if(count2==position-1)
					   break;
				 p=p.next;
			
				 count2++;
		    }
			
			
				(p.prev).next=p.next;
					(p.next).prev=p.prev;
			
				return head; 
			 
		 }	 
		 
			 
	 }
	 
	 
	 public void show()
	 {
		 p=head;
		 while(p !=null)
		 {
			 System.out.println(" Element is :"+p.data);
			 p=p.next;
		 }
		 
		 
		 
		 
		 
	 }

	 



}



class DllTest
{

	public static void main(String args[])
	{
	  MyDll l=new MyDll();
	 Node h =l.delete(1);
	  Node n=l.addnode(4);
	  h=l.insert(6,n);
	  l.show();
	   System.out.println("----------");
	 n=l.addnode(3);
	    h=l.insert(1,n);
	     l.show();
		   System.out.println("----------");
		  n=l.addnode(5);
	    h=l.insert(3,n);
	     l.show();
		   System.out.println("----------");
	      n=l.addnode(6);
	    h=l.insert(4,n);
	     l.show();
		  System.out.println("----------");
	      n=l.addnode(8);
	    h=l.insert(2,n);
	     l.show();
		 System.out.println("----------");
		 	 h =l.delete(1);
			  l.show();
			   System.out.println("----------");
		 	 h =l.delete(4);
			  l.show();
			     System.out.println("----------");
		 	 h =l.delete(2);
			  l.show();
			  
			  
	
	
	}	
	
	



}