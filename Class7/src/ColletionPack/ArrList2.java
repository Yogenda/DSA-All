package ColletionPack;
import java.util.*;
public class ArrList2 {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(101);
		arrList.add(102);
		arrList.add(103);
		arrList.add(104);
		arrList.add(105);
		
		System.out.println(arrList);
		// traversing  using foreach loop
		for(int n : arrList) // foreach
		{
			System.out.println(n);
		}
		System.out.println("-----------------");
		//using Iterator interface
		Iterator itr = arrList.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
