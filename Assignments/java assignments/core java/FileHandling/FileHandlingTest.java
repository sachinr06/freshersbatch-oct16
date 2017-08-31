package FileHandling;

import java.io.*;

public class FileHandlingTest {

	public static void main(String args[]) throws IOException{
		File file= new File("abc.txt");
		FileInputStream fis=new FileInputStream(file);
		File file2= new File("xyz.txt");
		FileOutputStream fos=new FileOutputStream(file2);
		StringBuilder sb=new StringBuilder("");
		int  i=0;
		do{
			i = fis.read();
			if(i!=-1)
				fos.write((char)i);
			
		}while(i!=-1);
		System.out.println(sb.toString());
	    
	}
}
