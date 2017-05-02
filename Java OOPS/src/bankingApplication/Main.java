package bankingApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader (System.in));
		while(true){
			
			System.out.println("Please enter your choice: ");
			System.out.println("1: add Customer");
			System.out.println("2: Deposit Money");
			System.out.println("3: Withdraw Money");
			System.out.println("4: Check Balance");
			System.out.println("5: Calculate interest");
			System.out.println("6: Exit");
			int choice = Integer.parseInt(bufferedreader.readLine());
			
		}
		
		
//		Account ac1 = new Account("p123", 100);
//		
//		
//		ac1.deposit(2000);
//		
//		
//		
//		ac1.withdraw(100);
//		//now account has exactly 2000 bucks , 2nd transaction
//		ac1.withdraw(1900);
//		System.out.println(ac1.getBalance());
//		System.out.println(ac1.firstTime);
		

	}

}
