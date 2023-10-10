package Synchronization;

class SharedResource1 {
	public void Wish(String sname) {
		synchronized (this) {
			System.out.println("Thread Started....");

			for (int i = 1; i <= 5; i++) {
				System.out.println("Good Morning : " + sname);
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
				}
			}

			System.out.println("Thread Ended....");
		}
	}
}

class DemoThread1 extends Thread {
	private String name;
	private SharedResource1 sr;

	DemoThread1(String name, SharedResource1 sr) {
		this.name = name;
		this.sr = sr;
	}

	public void run() {
		sr.Wish(name);
	}
}

public class SyncMain2 {

	public static void main(String[] args) {
		SharedResource1 s = new SharedResource1();

		DemoThread1 dt1 = new DemoThread1("Yogendra", s);
		DemoThread1 dt2 = new DemoThread1("Ramesh", s);
		dt1.start();
		dt2.start();
	}
}
