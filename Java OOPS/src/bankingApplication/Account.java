package bankingApplication;

public class Account {

private	double balance =0;
private	String  accountNumber ;
private boolean firstTime =true;

	
public Account(String accnum, double bal){
	if(bal>=100)
	{
		this.balance= bal;
		
	}
	else
	{
		System.out.println("Balance must be atleast 100");
}
this.accountNumber =accnum;
}

	public void deposit(double sum ){
		if(sum>0){
			this.balance+= sum;
			System.out.println(sum + " deposited successfully");
			
		}
		
		else{
			System.out.println("negative use withdraw method");
		}
	}
	
public void withdraw(double sum){
	if(sum <= this.balance -100){
		
		if(firstTime){
			this.balance-= sum;
			System.out.println(sum + "withdrawn successfully");
			firstTime = false;
		}
		
		
		else{
			this.balance-=(sum + Bank.transactionFees);
			
		}
		
		
	}
	
	else{
		System.out.println("negative, cannot withdraw account must have at least 100");
	}
		
	}

public double getBalance(){
	return this.balance;
}
}
