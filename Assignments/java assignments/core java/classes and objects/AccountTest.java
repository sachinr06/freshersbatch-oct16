class Account
{
   static int balance;
   private int accNo;
   
Account(int accNo,int balance)
{
	this.accNo=accNo;
	this.balance=balance;
	
	
}
   public void deposit(int amt){
	   
	   balance=balance+amt;
	   
	   
   }
   
   public void withdraw(int amt)
   
  {
	   
	   if(amt>balance)
	   {
		   System.out.println(" Insufficient Balance ");
	   }
	   
	   else
	   {
		   
		   balance=balance-amt;
	   }
	   
	   
	   
   }
   
   
   public void show()
   {
	   System.out.println("Account Number : "  +accNo+  " has balance  : " +balance);
	   
   }   

}


public class AccountTest{

public static void main(String args[])
{
 Account A=new Account(1,2000);
 A.deposit(1000);
 A.show();
 A.withdraw(5500);
 A.show();
 A.withdraw(300);
 A.show();

}


}