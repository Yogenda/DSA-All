package SetCollection;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
			Set<String>  setEx  =  new TreeSet<String>();
			
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
