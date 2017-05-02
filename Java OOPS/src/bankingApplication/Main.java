package bankingApplication;

public class Main {

	public static void main(String[] args) {
	
		Account ac1 = new Account("p123", 100);
		
		
		ac1.deposit(2000);
		
		
		
		ac1.withdraw(100);
		//now account has exactly 2000 bucks , 2nd transaction
		ac1.withdraw(1900);
		System.out.println(ac1.getBalance());
		System.out.println(ac1.firstTime);
		

	}

}
