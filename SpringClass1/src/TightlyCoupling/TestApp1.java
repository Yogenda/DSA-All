package TightlyCoupling;

public class TestApp1 {

	public static void main(String[] args) {
		SmartWorker sw = new SmartWorker();
		LazyWorker lw = new LazyWorker();
		ExtraSmartWorker  esw = new ExtraSmartWorker();
		Manager manager = new Manager(lw, sw, esw);
		manager.ManagerWork();
	}
}
