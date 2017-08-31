package threadpackage;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OvalMovementTemplate extends Frame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int y1 = 400, y2 = 400, y3 = 400;
	Thread t1,t2,t3;
	volatile boolean flag=false;
	int n=0;
	public OvalMovementTemplate() {
		super("Oval Game");
		
		t1=new Thread(this);
		t1.setName("BALL1");
		t1.start();
		t2=new Thread(this);
		t2.setName("BALL2");
		t2.start();
		t3=new Thread(this);
		t3.setName("BALL3");
		t3.start();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}
	
	@Override
	public  void run(){

	Thread current=Thread.currentThread();
	 if(current.getName().equals("BALL1"))
	 {
		
		 while(true)
		 {
		 for(int i=this.y1;i>50;i-=3)
		 {
			y1=y1-3;
			 repaint();
			try{ Thread.sleep(200);} catch(Exception e){e.printStackTrace();}
		 }
		  n++;
	        sync();   
	       
		 for(int i=y1;i<=400;i+=3)
		 {
			 y1=y1+3;
			 repaint();
			try{ Thread.sleep(200);} catch(Exception e){e.printStackTrace();}
		 }
		  n++;
			 sync(); 
		 }
		} 
		 
	 
	 else
	 if(current.getName().equals("BALL2"))
	 {
		
		 while(true)
		 {
		 for(int i=y2;i>50;i-=3)
		 {
			 y2=y2-3;
			 repaint();
			try{ Thread.sleep(150);} catch(Exception e){e.printStackTrace();}
		 }
		  n++;
		 sync();   
		 for(int i=y2;i<=400;i+=3)
		 {
			 y2=y2+3;
			 repaint();
			try{ Thread.sleep(150);} catch(Exception e){e.printStackTrace();}
		 }
		  n++;
			 sync(); 
		 }
		 }
	 
	 else
		 if(current.getName().equals("BALL3"))
		 {
			
			 while(true)
			 {
			 for(int i=y3;i>50;i-=3)
			 {
				 y3=y3-3;
				 repaint();
				try{ Thread.sleep(100);} catch(Exception e){e.printStackTrace();}
			 }
			  n++;
			 sync();   
			 for(int i=y3;i<=400;i+=3)
			 {
				 y3=y3+3;
				 repaint();
				try{ Thread.sleep(100);} catch(Exception e){e.printStackTrace();}
			 }
			  n++;
				 sync(); 
			 
			 } 
		 }
	 
		 }
	boolean fair =true;
	ReentrantLock lock = new ReentrantLock(fair); 
	 Condition cond=lock.newCondition();
	
	void sync() // using ReentrantLock
	{
		

	  
		try {
			lock.lock();
			if(n%3!=0)
			  {  
			 try {
					cond.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			  else
		      {
		    	cond.signalAll();
		    	  
		    	  
		      }
			
		}
	  finally
	  {
		  lock.unlock();
		 
	  }
     
     
      
	  } 
	
/*	synchronized void sync() //synchronized
	{
		


			if(n%3!=0)
			  {  
			 try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			  else
		      {
		    	notifyAll
		    	  
		    	  
		      }
			
		}
	 
     
      
	  */
    
	
	

	
	
	public static void main(String args[]) {
		Frame om = new OvalMovementTemplate();
		om.setSize(600, 600);
		om.setBackground(Color.CYAN);
		om.setVisible(true);
		
	}
}