package Synchronization;

class SharedResource {
	public synchronized void Wish(String sname) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Morning : " + sname);
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
			}
		}
	}
}

class DemoThread extends Thread {
	private String name;
	private SharedResource sr;

	DemoThread(String name, SharedResource sr)

	{
		this.name = name;
		this.sr = sr;
	}

	public void run() {
		sr.Wish(name);
	}
}

public class SyncMain {
	public static void main(String[] args) {
		SharedResource s = new SharedResource();

		DemoThread dt1 = new DemoThread("Yogendra", s);
		DemoThread dt2 = new DemoThread("Ramesh", s);
		dt1.start();
		dt2.start();
	}
}
