package Synchronization;

class  SharedResource3
{
	public synchronized static void Wish(String sname)
	{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Good Morning : " + sname);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception ex) {}
			}
	}
}


class DemoThread3 extends Thread
{
	private String name;
	
	DemoThread3(String name)
	{
		this.name =name;
	}
	
	public void run()
	{
		SharedResource3.Wish(name);
	}
}

public class SyncMain3 {

	public static void main(String[] args) {
		DemoThread3  dt1 = new DemoThread3("Yogendra");
		DemoThread3  dt2 = new DemoThread3("Ramesh");
		dt1.start();
		dt2.start();
	}
}
