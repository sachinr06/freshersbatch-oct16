package FileHandling;

import java.io.*;

public class DataInputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("account.txt"); 
		FileInputStream fis = new FileInputStream(file); 
		DataInputStream dis = new DataInputStream(fis); 
		int acc_no = dis.readInt(); 
		double balance = dis.readDouble();
		String name = dis.readUTF();
		dis.close();
		fis.close();
		
		System.out.println("acc_no : "+acc_no);
		System.out.println("bal : "+balance);
		System.out.println("name : "+name);
	}

}
