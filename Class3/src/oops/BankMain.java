package oops;

public class BankMain {

	public static void main(String[] args) {
		Bank cust1 = new Bank();
		cust1.getCustomerInfo("Venu", 10000);
		Bank cust2 = new Bank();
		cust2.getCustomerInfo("Renu", 20000);
		
		cust1.printcustinfo();
		System.out.println("---------------");
		cust2.printcustinfo();
		System.out.println("---------------");
		Bank.printBankBal();
	}

}
