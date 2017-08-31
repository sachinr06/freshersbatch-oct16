package jdk8features;

import java.util.ArrayList;
import java.util.List;

public class Order {
	   int price;
	   String status;
	   String name;
	 Order(String name,int price,String status){
		 this.name=name;
		 this.price=price;
		 this.status=status;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Order o=new Order("Bike",9000,"COMPLETED");
		Order o1=new Order("Laptop",10000,"NEW");
		Order o2=new Order("Shoes",8000,"ACCEPTED");
		Order o3=new Order("Car",90000,"REJECTED");
		Order o4=new Order("House",4000,"COMPLETED");
		Order o5=new Order("Mobile",11000,"ACCEPTED");
		
		List<Order> orders=new ArrayList<Order>();
		orders.add(o);
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		orders.add(o5);
		
		OrderPredicate priceOrder =   (Order oo)->oo.price > 10000; 
		for(Order obj:orders){
			if(priceOrder.test(obj))
			{
				System.out.println(obj.name);
			}
		}
		
		
		OrderPredicate statusOrder =   (Order oo)->oo.status.equals("ACCEPTED") ||oo.status.equals("COMPLETED");
		for(Order obj:orders){
			if(statusOrder.test(obj))
			{
				System.out.println(obj.name);
			}
		}
	}

}
