package bankingApplication;

public class Account {

private	double balance =0;
private	String  accountNumber ;
	
	
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
			System.out.println(sum + "deposited successfully");
			
		}
		
		else{
			System.out.println("negative use withdraw method");
		}
	}
	
public void withdraw(){
		
	}

public void getBalance(){
	
}
}
