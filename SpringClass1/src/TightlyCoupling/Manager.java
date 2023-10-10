package TightlyCoupling;

public class Manager {
	LazyWorker lw;
	SmartWorker sw;
	ExtraSmartWorker  esw;
	
	public Manager(LazyWorker lw, SmartWorker sw, ExtraSmartWorker esw)
	{
		this.lw = lw;
		this.sw = sw;
		this.esw = esw;
	}
	
	public void ManagerWork()
	{
		lw.Work();
		sw.Work();
		esw.Work();
	}
}
