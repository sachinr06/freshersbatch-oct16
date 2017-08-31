package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class FileDetails {

	public static void main(String args[]) throws IOException{
		File file= new File("abc.txt");
	 String a=file.getName();
	 System.out.println("File Name : "+a);
	
	 double bytes = file.length();
	 System.out.println("File Size: "+bytes +"bytes");
	 
	 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		System.out.println("DATE LAST MODIFIED : " + sdf.format(file.lastModified()));
		System.out.println(" IS FILE : " + file.isFile());
		System.out.println(" IS DIRECTORY : " + file.isDirectory());
		
		
	 
	}
}
