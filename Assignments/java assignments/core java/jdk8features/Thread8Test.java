package jdk8features;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class Thread8 extends Thread{
 Thread t;
	Thread8(){
	 t=new Thread();
		t.start();
	  
  }
	
	public void run(){
		List<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Consumer<Integer> consumer =   (Integer x)->System.out.println(x);
		for(Integer y:list){
			consumer.accept(y);
		}
	}
	
}


public class Thread8Test{
	public static void main(String args[]){
	 new Thread8();
	}
}