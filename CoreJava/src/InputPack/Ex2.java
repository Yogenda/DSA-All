package InputPack;
// Calculate Area of Circle:  PI*r*r 
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		// declaring constant variable
		final float PI = 3.14f;
		
		System.out.println("Enter radius of circle ");
		float radius = scr.nextFloat();
		
		float area = PI*radius*radius;
		
		System.out.println("Area of Circle is : " + area);
	}
}
