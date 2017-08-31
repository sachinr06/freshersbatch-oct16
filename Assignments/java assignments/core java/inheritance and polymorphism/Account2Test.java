class Account{
  private int accNo;
  String name;
  double balance;
  
 Account(int accNo,String name,double balance){
  this.accNo=accNo;
  this.name=name;
  this.balance=balance;
  
  }
  public double getBalance()
  {
   return this.balance;
  }
}

class Savings extends Account{

 
  private double fixedDeposit;
 Savings(int accNo,String name,double balance,double fixedDeposit){
		super(accNo,name,balance);
		this.fixedDeposit=fixedDeposit;
  
  
  }
  public double getBalance()
  {
   return this.fixedDeposit+super.getBalance();
  }

}

class Current extends Account{

  private double cashCredit;
  Current(int accNo,String name,double balance,double cashCredit){
		super(accNo,name,balance);
		this.cashCredit=cashCredit;
  
  
  }
  public double getBalance()
  {
   return this.cashCredit+super.getBalance();
  }

}

class Account2Test{

 public static double getTotalCashInBank( Account acc[])
 { 
 double totalBalance=0.0;
  for(int i=0;i<acc.length;i++)
  {
     totalBalance=totalBalance+acc[i].getBalance();
   
  
  }
 return totalBalance;
 }
 public static void main(String args[])
 {
   Account a[] = new Account[6];
   a[0]= new Savings(1,"peter",1000,200);
   a[1]=new Current(2,"patrik",2000,300);
   a[2]=new Savings(3,"rock",3000,400);
   a[3]=new Current(4,"john",4000,500);
   a[4]=new Savings(5,"ivan",5000,600);
   a[5]=new Current(6,"reven",6000,700);
   double totalBalance=getTotalCashInBank(a);
   System.out.println("Total Cash in Bank: "+totalBalance);
   
 
 
 }

}