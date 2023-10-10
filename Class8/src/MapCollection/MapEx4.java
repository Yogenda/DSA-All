package MapCollection;
import java.util.*;
public class MapEx4 {
// delete key 
	public static void main(String[] args) {
		
		Map<Integer, String>  stdMap = new HashMap<Integer, String>();
		
		stdMap.put(1001, "Naveen Kumar");
		stdMap.put(1002, "Mahesh Kumar");
		stdMap.put(1001, "Mahathi Kumar");
		stdMap.put(1003, "Ramesh Kumar");
		stdMap.put(1004, "Mahesh Kumar");
		stdMap.put(1005, "Lokesh Kumar");
			
		System.out.println(stdMap);
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a key to modify value");
		int k = scn.nextInt();
		
		if(stdMap.containsKey(k))
		{
			System.out.println("Present Value : " + stdMap.get(k));
			System.out.println("Do u want to delete : " );
			String ch = scn.next();

			if(ch.equals("yes"))
				stdMap.remove(k);
			
			System.out.println("After Modify : "+ stdMap);	
		}
		else
			System.out.println("NO key found in Map");
	}

}
