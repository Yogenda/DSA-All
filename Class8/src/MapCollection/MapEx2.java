package MapCollection;
import java.util.*;
public class MapEx2 {

	public static void main(String[] args) {
		
		Map<Integer, String>  stdMap = new HashMap<Integer, String>();
		
		stdMap.put(1001, "Naveen Kumar");
		stdMap.put(1002, "Mahesh Kumar");
		stdMap.put(1001, "Mahathi Kumar");
		stdMap.put(1003, "Ramesh Kumar");
		stdMap.put(1004, "Mahesh Kumar");
		stdMap.put(1005, "Lokesh Kumar");
			
		System.out.println(stdMap);
		
		// Traversing using for loop
		
		for(Map.Entry<Integer, String> sinfo: stdMap.entrySet()) {
			System.out.println(sinfo.getKey()+"\t" + sinfo.getValue());
		}
		
	}

}
