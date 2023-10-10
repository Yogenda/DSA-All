package oops;

public class Bank {

	private String cname;
	private int accbal;
	private static int bankbal;

	void getCustomerInfo(String cn, int bal) {
		cname = cn;
		accbal = bal;
		bankbal = bankbal + accbal; 
	}

	void printcustinfo() {
		System.out.println("Customer Name : " + cname);
		System.out.println("Amount in Account : " + accbal);
	}

	static void printBankBal() {
		System.out.println("Total Amount in a Bank : " + bankbal);
	}
}

//c1.getInfo(“abc”, 10000)
//c2.getInfo(“aabc”, 20000)
