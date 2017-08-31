package FileHandling;

import java.io.*;

class Date implements Serializable{
	int day;
	int month;
	int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

class Account2 implements Serializable{
	int acc_no;
	double balance;
	Date dob;
	String name;
	public Account2(int acc_no, double balance, Date dob, String name) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
		this.dob = dob;
		this.name = name;
		
		
	}
	@Override
	public String toString() {
		return "Account2 [acc_no=" + acc_no + ", balance=" + balance + ", dob=" + dob + ", name=" + name + "]";
	}
	
	
}
public class SerializableTest {
 
	static void serialize() throws IOException{
		File file = new File("account2.txt");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(new Account2(1,2000.2,new Date(6,10,1995),"Sachin")); 
			out.flush(); out.close();
	}
	
	static void deserialize() throws IOException, ClassNotFoundException{
		File file = new File("account2.txt"); 
		FileInputStream fin = new FileInputStream(file); 
		ObjectInputStream in = new ObjectInputStream(fin);
		Account2 ac = (Account2)in.readObject(); 
		System.out.println("order = " + ac);

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		serialize();
		deserialize();
	}

}
