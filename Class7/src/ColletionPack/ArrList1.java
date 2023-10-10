package ColletionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList1 {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("Ramesh");
		arrList.add("Suresh");
		arrList.add("Mahesh");
		arrList.add("Tarun");
		arrList.add("Sonu");
		System.out.println(arrList);
		// traversing  using foreach loop
		for(String str : arrList) // foreach
		{
			System.out.println(str);
		}
		System.out.println("-----------------");
		//using Iterator interface
		//An Iterator is an object that can be used 
		//to loop through collections, like ArrayList and HashSet. 
		Iterator itr = arrList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
