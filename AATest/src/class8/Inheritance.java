package class8;

class Animal{
	void eat() {
		System.out.println("animal is eating food..");
	}
}
class Dog extends Animal{
	void speek() {
		System.out.println("Dog is barking..");
	}
}
class SmallDog extends Dog{
	void cry(){
		System.out.println("Dog baby crying.");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		SmallDog d = new SmallDog();
		d.speek();
		d.eat();	
		d.cry();
	}

}
