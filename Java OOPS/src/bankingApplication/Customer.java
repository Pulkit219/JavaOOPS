package bankingApplication;

public class Customer {

	private String name;
	private Account account;
	
	public Customer(String n, Account ac){
		
		name= n;
        account = ac;
	}
	
	public String getName(){
		return name;
	}
	
    public Account getAccount(){
		return this.account;
	}

    public void display(){
	
    	System.out.println("Name: " + this.name + "Account NUmber: " + account.getBalance() + " " + account.getAccountNumber());
}
}
