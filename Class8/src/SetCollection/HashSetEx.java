package SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String>  setEx  =  new HashSet<String>();
		
		setEx.add("Hyderabad");
		setEx.add("Bangalore");
		setEx.add("Pune");
		setEx.add("Hyderabad");
		setEx.add("Mumbai");
		
		System.out.println(setEx);
		
		for(String str:setEx)
			System.out.println(str);
		
		System.out.println("------------");
		
		Iterator itr = setEx.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
