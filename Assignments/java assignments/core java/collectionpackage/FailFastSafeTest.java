package collectionpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

class FailFast implements Runnable {	
		Thread  t1,t2;
		ConcurrentHashMap<String,String> hmap=new ConcurrentHashMap<String,String>();
		public FailFast(){
		
			hmap.put("ABC", "DEF");
			hmap.put("PQR", "STV");
			hmap.put("XYZ", "UYR");
			t1=new Thread(this);
			t1.setName("ITERATE");
			t1.start();
			 t2=new Thread(this);
			t2.setName("MODIFY");
			t2.start();
		}
		
		public void run(){
			
			Thread current=Thread.currentThread();
			 if(current.getName().equals("ITERATE"))
			 {
				boolean flag=true;
					Iterator<String> itr=hmap.keySet().iterator();;
					while(itr.hasNext()){
						
						System.out.println(itr.next());
					/*	if(flag){
						hmap.put("XO", "PYR");
						flag=false;
						}*/
					
					}
			 }
			 if(current.getName().equals("MODIFY"))
			 {

					
				 hmap.put("XP", "PYR");
				 hmap.put("AP", "PoiR");
				 hmap.put("XO", "PYwqr");
			 }
			 

	}
	

}



public class FailFastSafeTest{
	
	public static void main(String args[]){
		FailFast f=new FailFast();
		
	}
	
}
