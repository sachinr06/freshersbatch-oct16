package threadpackage;

class Threading implements Runnable{

Thread  t1,t2,t3;
int capacity=1000;
int level=700;
public Threading(){

 t1=new Thread(this);
t1.setName("INLET");
t1.start();
 t2=new Thread(this);
t2.setName("OUTLET");
t2.start();
t3=new Thread(this);
t3.setName("CONTROLLER");
t3.setDaemon(true);
t3.start();
}



@Override
public void run(){
 
Thread current=Thread.currentThread();
 if(current.getName().equals("INLET"))
 {
   for(;;){
     level=level+50;
     System.out.println("Level :"+level);
   try{Thread.sleep(500);} catch(Exception e){e.printStackTrace();}
   }
 }
 else if(current.getName().equals("OUTLET"))
 {
      for(;;){
    	  level=level-50;
    	     System.out.println("Level :"+level);
    try{Thread.sleep(200);} catch(Exception e){e.printStackTrace();}
 }

 

}
 else if(current.getName().equals("CONTROLLER"))
 {
      for(;;)
      {
       if(level>800)
       {
    	   
    	 t1.suspend();
    	 t2.resume();
       }
       else if(level<800)
       {
    	   t1.resume();
    	   t2.suspend();
       }
      }   
    
 }

}

}

public class WaterTankTest{
public static void main(String args[]){
	
	
	new Threading();
	
	
	
	
}
	
}


