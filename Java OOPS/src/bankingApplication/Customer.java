package bankingApplication;

public class Customer {

	private String name;
	private Account account;
	
	public Customer(String n, Account ac){
		
		name= n;
        account = ac;
	}
	
	public void getName(){
		
	}
	
    public void getAccount(){
		
	}

    public void display(){
	
    	System.out.println("Name: " + name + "");
}
}
