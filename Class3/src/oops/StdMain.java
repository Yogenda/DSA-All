package oops;

public class StdMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.getStdInfo();
		std1.printStdinfo();
		
		System.out.println("------------------");
		Student std2 = new Student();
		std2.getStdInfo();
		std2.printStdinfo();
	}
}
