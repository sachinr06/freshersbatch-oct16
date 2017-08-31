package threadpackage;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  Thread t1,t2,t3;
  int x=150,y=250,w=200,h=150;
  double level=x/h;
  
	public WaterTank() {
		super("Ball game");
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
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
		
	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300);
		g.setColor(Color.RED);
		g.fillRect(x,y,w,h);
		g.drawString("70%", 380, 200);
	}

	 @Override
	 public void run(){
		 
		 Thread current=Thread.currentThread();
		 if(current.getName().equals("INLET"))
		 {
			 /* for(;;){
			 h=h+5;
			 y=y-5;
			 repaint();
			 }*/
		
		 }
		 else if(current.getName().equals("OUTLET"))
		 {
				/* for(;;){
			 
			 h=h-5;
			 y=y+5;
			 level=x/h;
			 repaint();
		 }*/
		
		 }
		 else if(current.getName().equals("CONTROLLER"))
		 {
			
			 
			
		 }
		 
		
		 
	 }
	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}
}

