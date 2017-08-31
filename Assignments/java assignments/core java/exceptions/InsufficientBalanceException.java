package exceptions;

public class InsufficientBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int  message;
	public  InsufficientBalanceException()
	{
		this.message=0; 
	} 
	public  InsufficientBalanceException(int message)
	{ 
		this.message = message;
	}
	public String toString()
	{
		return "Balance is less than your amount"  + this.message; 
		
	}
}

