package Third_class;
import java.util.Scanner; //import the Scanner class of util package

public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Object creation
		System.out.print("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("You have entered: "+a);
		
	}

}
