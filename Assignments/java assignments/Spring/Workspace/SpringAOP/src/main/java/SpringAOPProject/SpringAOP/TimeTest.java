package SpringAOPProject.SpringAOP;
import java.util.*;
public class TimeTest {

	public void  addInList(){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<1000;i++){
			list.add(i);
		}
	 }
	 
	public void  addInVector(){
		Vector<Integer> vec=new Vector<Integer>(); 
		for(int i=0;i<1000;i++){
		 vec.addElement(new Integer(i));
		 
		}
		/*for(int i=0;i<1000;i++){
			System.out.println( vec.elementAt(i));*/
			 
		
		 
	 }
}
