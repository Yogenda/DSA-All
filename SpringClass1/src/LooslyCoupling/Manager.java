package LooslyCoupling;

public class Manager {

	IWorker iw;
	
	public Manager(IWorker iw)
	{
		this.iw = iw;
	}
	
	public void ManagerWorker()
	{
		iw.Work();
	}
}
