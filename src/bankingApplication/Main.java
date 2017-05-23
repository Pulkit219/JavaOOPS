package bankingApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int numberOfCustomers = 0;
		Bank bank  = new Bank();
		Customer [] c = bank.getCustomer();
		
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
			
			
			
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Creating an account");
				System.out.println("Please deposit initial amount to open min 100 bucks");
				double initBal = Double.parseDouble(bufferedreader.readLine());
				System.out.println("Please enter your account number: ");
				String acc = bufferedreader.readLine();
				Account account = new Account(acc, initBal);
				System.out.println("Please enter your Name: ");
				String name = bufferedreader.readLine();
				Customer customer = new Customer(name, account);
				c[numberOfCustomers] = customer;
				numberOfCustomers++;
//				System.err.println(numberOfCustomers);
//				for (int i = 0; i < numberOfCustomers; i++) {
//					System.err.println("Name: " + c[i].getName() + " Account: " + c[i].getAccount().getAccountNumber());
//				}
				
				break;
				
				
				
				
			
			case 2:
				
				System.out.println("Enter the account number");
				acc = bufferedreader.readLine();
				
				if(numberOfCustomers == 0)
				{
					System.out.println("Please add cutomers");
				}
				
				else
				{
				
					for(int i =0;i<numberOfCustomers; i++)
					{
						Account temp = c[i].getAccount();
						String accTemp = temp.getAccountNumber();
						if(accTemp.equals(acc))
						{
							System.err.println("Please enter the amount to deposit");
							double money = Double.parseDouble(bufferedreader.readLine());
							temp.deposit(money);
							
						}
						else
						{
							System.err.println("Account not found");
						}
					}
				}
				break;
				
				
				
				
				
				
			case 3:
				
				
				System.err.println("Enter the account number");
				acc = bufferedreader.readLine();
				
				if(numberOfCustomers == 0)
				{
					System.err.println("Please add cutomers");
				}
				
				else
				{
				
					for(int i =0;i<numberOfCustomers; i++)
					{
						Account temp = c[i].getAccount();
						String accTemp = temp.getAccountNumber();
						if(accTemp.equals(acc))
						{
							System.err.println("Please enter the amount to withdraw");
							double money = Double.parseDouble(bufferedreader.readLine());
							temp.withdraw(money);
							
						}
						else
						{
							System.err.println("Account not found");
						}
					}
				}
				break;
				
				
				
				
				
				
			case 4:
				
				System.err.println("Enter the account number");
				acc = bufferedreader.readLine();
				
				if(numberOfCustomers == 0)
				{
					System.err.println("Please add cutomers");
				}
				
				else
				{
				
					for(int i =0;i<numberOfCustomers; i++)
					{
						Account temp = c[i].getAccount();
						String accTemp = temp.getAccountNumber();
						if(accTemp.equals(acc))
						{
							System.err.println(" balance : " +  temp.getBalance());
							
							
						}
						else
						{
							System.err.println("Account not found");
						}
					}
				}
				
				break;
				
				
				
				
				
				
			case 5:
				
				System.err.println("Enter the account number");
				acc = bufferedreader.readLine();
				
				if(numberOfCustomers == 0)
				{
					System.err.println("Please add cutomers");
				}
				
				else
				{
				
					for(int i =0;i<numberOfCustomers; i++)
					{
						Account temp = c[i].getAccount();
						String accTemp = temp.getAccountNumber();
						if(accTemp.equals(acc))
						{
							bank.calculateInterest(c[i]);
							
						}
						else
						{
							System.err.println("Account not found");
						}
					}
				}
				break;
				
				
				
				
				
			case 6:
				System.out.println("Program terminated");
				System.exit(0);
				break;
				
			default:
				break;
			
			}
			
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
