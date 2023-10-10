package LooslyCoupling;

public class TestApp2 {

	public static void main(String[] args) {
		Manager manager = null;
		
		LazyWorker  lw = new LazyWorker();
		manager = new Manager(lw);
		manager.ManagerWorker();
		
		SmartWoker sw = new SmartWoker();
		manager = new Manager(sw);
		manager.ManagerWorker();
		
		ExtraSmartWoker esw = new ExtraSmartWoker();
		manager = new Manager(esw);
		manager.ManagerWorker();
	}
}
