package BankQ;

public class Main {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(1000,-1000,"lisa");
		BankAccount acc2 = new BankAccount(1000,-1000,"bob");
		System.out.println(acc1.getOwner() + " balance: " + acc1.getBalance());
		System.out.println(acc2.getOwner() + " balance: " + acc2.getBalance());
		boolean check = acc1.transfer(acc2, 500);
		if (check == false) {
			System.out.println("error amount can not be transferd");
		}
		else {
			System.out.println("transfer from lisa to bob success = " + check);
		}
		System.out.println(acc1.getOwner() + "'s balance: " + acc1.getBalance());
		System.out.println(acc2.getOwner() + "'s balance: " + acc2.getBalance());
		check = acc1.transfer(acc2, 1600);
		if (check == false){
			System.out.println("error amount can not be transferd");
		}
		else {
			System.out.println("transfer from lisa to bob success = " + check);
		} 
		System.out.println(acc1.getOwner() + "'s balance: " + acc1.getBalance());
		System.out.println(acc2.getOwner() + "'s balance: " + acc2.getBalance());
	}
}
