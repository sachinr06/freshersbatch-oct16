import java.util.*;  

abstract class DesertItem{
	
	abstract int getCost();
	
	
}

class Candy extends DesertItem{
 int cost;
 public Candy(int cost)
 {
    this.cost=cost;
 }
 public int getCost()
 {
	 return this.cost;
 }
}

class Cookie extends DesertItem{
 int cost;
 public Cookie(int cost)
 {
    this.cost=cost;
 }
 public int getCost()
 {
	 return this.cost;
 }
}

class IceCream extends DesertItem{
 int cost;
 public IceCream(int cost)
 {
    this.cost=cost;
 }
 public int getCost()
 {
	 return this.cost;
 }
}

class DesertShop{

   static ArrayList<Candy> candies =new ArrayList<Candy>();
   
    static ArrayList<Cookie>cookies=new ArrayList<Cookie>();
   
   static ArrayList<IceCream> icecreams=new ArrayList<IceCream>();

}

class DesertShopTest{
	
	public static void main(String args[])
	
	{
		DesertItem d;
		int quantity;
		int cost;
		char again;		
		double bill=0;
		double tax;
		int i;
		 do
		  {
		System.out.println("Desert Shop");
		System.out.println("1.Owner ");
		System.out.println("2.Customer  ");
			System.out.println("Please Enter your Role : ");
			
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
							for(i=0;i<quantity;i++)
							{
						   	System.out.println(" Enter Cost of candy : ");
						    cost=sc.nextInt(); 
							 d=new Candy(cost);
							 DesertShop.candies.add((Candy)d);
							}
						        break;
				
						case 2:
								System.out.println(" Enter Quantity of Cookie : ");
						
						    quantity=sc.nextInt(); 
							for( i=0;i<quantity;i++)
							{
						   	System.out.println(" Enter Cost of cookie : ");
						    cost=sc.nextInt(); 
							 d=new Cookie(cost);
							 DesertShop.cookies.add((Cookie)d);
							}
						        break;
						case 3:
								System.out.println(" Enter Quantity of IceCream : ");
						
						    quantity=sc.nextInt(); 
							for(i=0;i<quantity;i++)
							{
						   	System.out.println(" Enter Cost of IceCream : ");
						    cost=sc.nextInt(); 
							 d=new IceCream(cost);
							 DesertShop.icecreams.add((IceCream)d);
							}
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
							 if(quantity<=DesertShop.candies.size())
							 {
							 for(i=0;i<quantity;i++)
							 {
							   cost=DesertShop.candies.get(i).getCost();
							   bill=bill+cost;
							   DesertShop.candies.remove(i);
							 
							 }
							 }
							 else
							 {
							   System.out.println("Insufficient Candies");
							 }
							 break;
						        
					    case 2: 
						 System.out.println(" Enter Quantity of Cookies : ");
						     quantity=sc.nextInt(); 
							 if(quantity<=DesertShop.cookies.size())
							 {
							 for(i=0;i<quantity;i++)
							 {
							   cost=DesertShop.cookies.get(i).getCost();
							   bill=bill+cost;
							   DesertShop.cookies.remove(i);
							 
							 }
							 }
							 else
							 {
							   System.out.println("Insufficient Cookies");
							 }
								break;
						case 3:
						 System.out.println(" Enter Quantity of IceCream : ");
						     quantity=sc.nextInt(); 
							 if(quantity <= DesertShop.icecreams.size())
							 {
							 for(i=0;i<quantity;i++)
							 {
							   cost=DesertShop.icecreams.get(i).getCost();
							   bill=bill+cost;
							   DesertShop.icecreams.remove(i);
							   System.out.println("Cost="+cost);
							 
							 }
							 }
							 else
							 {
							   System.out.println("Insufficient icecreams");
							 }
						   break;
					}
			       
			     break;
		  }
		    
		  System.out.println("Do You want to continue : ");
		    again = sc.next().charAt(0);
		 
		  }while(again=='y' || again=='Y');
		  System.out.println("Total cost:"+bill);
		  	  System.out.println("Tax:"+bill*0.10);
			   System.out.println("Total bill:"+(bill+(bill*0.10)));
	}
	
			

		 

}