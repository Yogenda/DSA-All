package SetCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
			Set<String>  setEx  =  new LinkedHashSet<String>();
			
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
