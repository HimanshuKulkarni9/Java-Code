package day2_HomeWork;

public class Account {
	private
	int accNo;
	String ownerName;
	double balance;
	
	public void setAccNo(int a) {
		
		accNo = a;
	}
	public int getAccNo() {
		return accNo;
	}
    public void setOwnerName(String n) {
		
		ownerName = n;
	}
	public String getOwnerName() {
		return ownerName;
	}
public void setBalance(double b) {
		
		balance = b;
	}
	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for acc number
		Account a1 = new Account();
		a1.setAccNo(22);
		System.out.println("Account Number: "+ a1.getAccNo());
		
		//for owner name
		a1.setOwnerName("Himanshu");
		System.out.println("Account Name: "+ a1.getOwnerName());
		
		// for balance
		a1.setBalance(5200);
		System.out.println("Account Balance: "+ a1.getBalance());
	}

}
