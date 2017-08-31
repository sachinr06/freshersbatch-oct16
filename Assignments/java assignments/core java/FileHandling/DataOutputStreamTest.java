


package FileHandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Account{
	int acc_no;
	double balance;
	String name;
	public Account(int acc_no, double balance, String name) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
		this.name = name;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


public class DataOutputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("account.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos); 
		Account ac=new Account(1,2000.2,"Sachin");
		Account ac2=new Account(2,2000.2,"Aniket");
		Account ac3=new Account(3,2000.2,"Gopal");
		List<Account> acc_list=new ArrayList<Account>();
		acc_list.add(ac);
		acc_list.add(ac2);
		acc_list.add(ac3);
		for(Account a:acc_list){
			dos.writeInt(a.acc_no);
			dos.writeDouble(a.balance);
			dos.writeUTF(a.name); 
			
		
		}

		
		dos.flush(); 
		fos.flush();
		dos.close();
		fos.close();

}
}


