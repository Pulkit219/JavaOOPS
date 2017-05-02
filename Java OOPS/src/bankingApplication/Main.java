package bankingApplication;

public class Main {

	public static void main(String[] args) {
	
		Account pulkit = new Account("p123", 100);
		
		
		pulkit.deposit(2000);
		
		
		
		pulkit.withdraw(100);
		//now account has exactly 2000 bucks , 2nd transaction
		pulkit.withdraw(1890);
		System.out.println(pulkit.getBalance());
		System.out.println(pulkit.firstTime);
		

	}

}
