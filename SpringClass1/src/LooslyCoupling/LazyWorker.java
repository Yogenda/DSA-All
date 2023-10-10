package LooslyCoupling;

public class LazyWorker implements IWorker{

	@Override
	public void Work() {
		System.out.println("Lazy worker");
	}
}
