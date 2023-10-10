package MapCollection;
import java.util.*;
public class Insurance {

	private static Map<Integer, String>  policy  = new TreeMap<Integer, String>();
	
	public void addPolicyDetails(int pid, String pname)
	{
		policy.put(pid, pname);
	}
	
	public Map<Integer, String>  ViewAll()
	{
		return policy;
	}
	
	public List<Integer>  searchBasedOnPolicyType(String search)
	{
		List<Integer>   pids = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, String>  temp : policy.entrySet())
		{
			String pname = temp.getValue();
			int pid = temp.getKey();
			
			if(pname.contains(search))
				pids.add(pid);
		}
		return pids;
	}
}
