package MapCollection;
import java.util.*;
public class MapEx1 {

	public static void main(String[] args) {
Map<Integer, String>  stdMap = new HashMap<Integer, String>();
		
		stdMap.put(1001, "Naveen Kumar");
		stdMap.put(1002, "Mahesh Kumar");
		stdMap.put(1001, "Mahathi Kumar");
		stdMap.put(1003, "Ramesh Kumar");
		stdMap.put(1004, "Mahesh Kumar");
		stdMap.put(1005, "Lokesh Kumar");
			
		System.out.println(stdMap);
		
		// Traversing using Iterator Interface
		
		Set<Integer>  rnos = stdMap.keySet();
		
		System.out.println(rnos);
		
		Iterator itr = rnos.iterator();
		
		while(itr.hasNext())
		{
			int rno = (int) itr.next();
			System.out.println(rno + "\t" + stdMap.get(rno));
		}		
	}
}
