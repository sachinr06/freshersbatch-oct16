import java.util.Scanner;  
abstract class DesertItem{
	
	abstract int getCost(int cost);
	abstract void addDesertItem(int quantity,int cost);
	
}



class Candy extends DesertItem{
    static int cost;
	static int quantity;
	public void addDesertItem(int req,int c)
	{
		this.quantity=this.quantity+req;
		this.cost=c;
	}
	public int getCost(int req)
	{
		    System.out.println(" Quantity req"+req);
			this.quantity=this.quantity-req;
			 System.out.println("Cost per unit: "+this.cost);
			int totalcost=req*this.cost*60;
					   
			System.out.println("totalcost"+totalcost);
		     return totalcost;
			 
	}
	
}

class Cookie extends DesertItem{
	 static int cost;
	static int quantity;
	public void addDesertItem(int quantity, int cost)
	{
		this.quantity=this.quantity+quantity;
		this.cost=cost;
	}
	public int getCost(int quantity)
	{
		
			this.quantity=this.quantity-quantity;
		     return quantity*cost*70;
	}
}

class IceCream extends DesertItem{
	 static int cost;
	static int quantity;
	public void addDesertItem(int quantity, int cost)
	{
		this.quantity=this.quantity+quantity;
		this.cost=cost;
	}
	public int getCost( int quantity)
	{
		
			this.quantity=this.quantity-quantity;
		     return quantity*cost;
	}
}



class DesertShop{
	
	public static void main(String args[])
	
	{
		DesertItem d;
		int quantity;
		int cost;
		char again;		
		double bill=0;
		double tax;
		 do
		  {
		System.out.println("Desert Shop");
			System.out.println("Please Enter your Role");
		 Scanner sc=new Scanner(System.in);  
		  int choice=sc.nextInt(); 
			

		 
		  switch(choice)
		  {
			  
			  
			  case 1:System.out.println(" Hi owner");
			  	 System.out.println("1.Candy");
					 System.out.println("2.Cookie");
					 System.out.println("3.IceCream");
			  	     System.out.println(" Select a item to add : ");
				
					 int choice2=sc.nextInt();  
					
			        switch(choice2)
					{
						case 1:
						System.out.println(" Enter Quantity of Candy : ");
						
						    quantity=sc.nextInt(); 
						   	System.out.println(" Enter Cost per unit : ");
						    cost=sc.nextInt(); 
							 d=new Candy();
							d.addDesertItem(quantity,cost);
						        break;
				
						case 2:
								System.out.println(" Enter Quantity of Cookie  : ");
								
							 quantity=sc.nextInt(); 
								System.out.println(" Enter Cost per unit : ");
								
							 cost=sc.nextInt(); 
							 d=new Cookie();
							d.addDesertItem(quantity,cost);
							     break;
						        
						case 3:
								System.out.println(" Enter Quantity of Icecream  : ");
							 quantity=sc.nextInt(); 
							System.out.println(" Enter Cost per unit  : ");
							 cost=sc.nextInt(); 
							 d=new IceCream();
							d.addDesertItem(quantity,cost);
							     break;
						        
						
					}
			     break;
			  
			  
			  case 2:System.out.println(" Hi User");
			  		 System.out.println("1.Candy");
					 System.out.println("2.Cookie");
					 System.out.println("3.IceCream");
				     System.out.println(" Select a item to buy  : ");
			
					int choice3=sc.nextInt();  
				 
			        switch(choice3)
					{
						case 1:
						    System.out.println(" Enter Quantity of Candy : ");
						     quantity=sc.nextInt(); 
							   System.out.println(" Quantity : "+quantity);
							 d=new Candy();
							
						    cost=d.getCost(quantity);
							System.out.println("costings in INR "+cost);
							bill=bill+cost;
							break;
						        
					    case 2: 
						System.out.println(" Enter Quantity of Cookie : ");
						     quantity=sc.nextInt(); 
						 d=new Cookie();
							 cost= d.getCost(quantity);
							 System.out.println("costings in INR "+cost);
							 bill=bill+cost;
									break;
						
						case 3:
						System.out.println(" Enter Quantity of Icecream  : ");
								   quantity=sc.nextInt();
						 d=new IceCream();
							cost= d.getCost(quantity);
							System.out.println("costings in INR "+cost);
							bill=bill+cost;
									break;
						   
					}
			       
			     break;
		  }
		    
		  System.out.println("Do You want to continue : ");
		    again = sc.next().charAt(0);
		 
		  }while(again=='y' || again=='Y');
		  System.out.println("Bill:"+bill);
	}
	
}