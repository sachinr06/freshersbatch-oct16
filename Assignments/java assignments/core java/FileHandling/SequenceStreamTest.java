package FileHandling;
import java.io.*;
public class SequenceStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin1=new FileInputStream("abc.txt"); 
		FileInputStream fin2=new FileInputStream("xyz.txt");  
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;  
		while((i=sis.read())!=-1)
		{ 
			System.out.println((char)i);  
			}  
		sis.close(); 
		fin1.close(); 
		fin2.close();

		

	}

}
