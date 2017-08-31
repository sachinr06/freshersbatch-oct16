interface Sortable{
	
     int compare(Sortable s);
	 void print();
}

class Circle implements Sortable{

   int radius;
 Circle(int radius)
 {
 this.radius=radius;
 
 }
 public void print()
  {
   System.out.println("Circle has radius : "+this.radius);
  }

  public int compare(Sortable c)
  {
   if(this.radius==((Circle)c).radius)
	   return 0;
   else if(this.radius>((Circle)c).radius)
	   return 1;
   else
	   return -1;
  }

}




class SortableTest {
	public static  void sortAll(Sortable s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for( int j=0;j<(s.length-i-1);j++)
			{
				if(s[j].compare(s[j+1])==1)
				{
					Sortable temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					
					
					
				}
			}
		}
	}

	public static void main(String args[])
	{
		
		Sortable s[]=new Sortable[4];
		
		s[0]=new Circle(3);
		s[1]=new Circle(1);
		s[2]=new Circle(5);
		s[3]=new Circle(2);
		System.out.println("Before SortAll");
		 for(int i=0;i<s.length;i++)
     s[i].print();
	System.out.println("After SortAll");
		sortAll(s);
		 for(int i=0;i<s.length;i++)
     s[i].print();
	
			
		
	}
	
}

