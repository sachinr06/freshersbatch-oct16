package exceptions;
class Account{
	
	int acc_no;
	int bal;
	Account(int acc_no,int bal){
		
		this.acc_no=acc_no;
		this.bal=bal;
		
		
	}
	public void deposit (int amt){
		
		this.bal=this.bal+amt;
		
	}
	public void withdraw (int amt) throws InsufficientBalanceException {
		
		if(amt>this.bal){
			throw new InsufficientBalanceException(amt);
		}
		else
		{
			
		this.bal=this.bal-amt;
		}
	}
}
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account A=new Account(1,2000);
		try {
			A.withdraw(50000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
