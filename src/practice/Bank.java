package practice;

public class Bank {
	
private String AccountHolder;
private double Balance;
private int AccountNumber;

	public Bank(String AccountHolder, int AccountNumber, double Balance) {
		this.AccountHolder=AccountHolder;
		this.AccountNumber=AccountNumber;
		this.Balance=Balance;
	}
	public double deposit( double amount){
		Balance+=amount;
		return Balance;
	}
	public double withdraw(double amount) {
		Balance-=amount;
		return amount;
	}
	public double checkBalance() {
		return Balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank Kotak=new Bank("Kedar", 123, 4000);
		Kotak.deposit(230);
		Kotak.checkBalance();
		Kotak.withdraw(856);
		Kotak.checkBalance();
		//System.out.println("hello");
		
	}

}
