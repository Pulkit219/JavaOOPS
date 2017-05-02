package bankingApplication;

public class Bank {
	
	
	private static double interestRate =8.5;
	private static int   transactionFees= 10;
    private Customer[] customers = new Customer [1000];

public void calculateInterest(Customer customer)
{
	Account a= customer.getAccount();
	double bal = a.getBalance();
	double interestAmount = bal*interestRate/100;
	double totalBalance = bal + interestAmount;
	System.out.println("the interest amount:" + interestAmount + "toatl money after adding int:" + totalBalance );
	
}

public static  double getInterestRate(){
	 return interestRate;
}

public static int getTransactionFees(){
	return transactionFees;
	
}


	
	

}
