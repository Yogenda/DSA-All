package class8;
//creete the parent class
class Vehicle{
	void run() {
		System.out.println("Vehicle is running.");
	}
}
// create the child class
class Bike2 extends Vehicle{
	void run() {
		System.out.println("Bike irunning...");
	}
}
public class MethodOverrid {

	public static void main(String[] args) {
		Bike2 obj =new Bike2();
		obj.run();
	}

}
