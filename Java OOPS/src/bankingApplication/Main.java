package bankingApplication;

public class Main {

	public static void main(String[] args) {
	
		Account pulkit = new Account("p123", 100);
		
		pulkit.deposit(-50);
		pulkit.deposit(50);
		pulkit.withdraw(100);
		System.out.println(pulkit.getBalance());
		

	}

}
