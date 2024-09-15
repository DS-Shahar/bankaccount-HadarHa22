
public class BankAccount {
	
	private int balance;
	private int minBalance;
	private String owner;
	
	public BankAccount(int b, int m,String s){
		this.balance = b;
		this.minBalance = m;
		this.owner = s;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int getMinBalance() {
		return this.minBalance;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setBalance(int newBalance) {
		if(newBalance > minBalance) {
			this.balance = newBalance;
		}
		else{
			System.out.println("error your new bLnce is under your limit");
		}
	}
	
	public void setOnwer(String str) {
		this.owner = str;
	}
	
	public boolean withdraw(int amount) {
	        if (balance - amount < minBalance) {
	            return false;}
	        this.balance = this.balance - amount;
	        return true;
	}
	
	public void deposit(int damount){
		this.balance = this.balance+ damount;
	}
	
	public boolean transfer(BankAccount t, int tamount) {
		if (withdraw(tamount)== false) {
			return false;
		}
		t.deposit(tamount);
		return true;
	}
	
	 public String toString() {
	        return "balance " + " of " + this.owner + ": " + balance;
	    }
}
