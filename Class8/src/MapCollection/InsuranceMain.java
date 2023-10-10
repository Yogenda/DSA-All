package MapCollection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class InsuranceMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(isr);
		Insurance ins = new Insurance();
		while(true)
		{
			System.out.println("1. Add Insurance Policy\n2. Search Insurance Policy\n3. View All Policies\n4. Exit");
			System.out.println("Pick Your Choice ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter No of Policies to add");
				int n = sc.nextInt();
				
				for(int i=1;i<=n;i++)
				{
					System.out.println("Policy ID ");
					int pno = sc.nextInt();
					System.out.println("Policy Name");
					String pname = br.readLine();

					ins.addPolicyDetails(pno, pname);
				}
				break;
			case 2:
				System.out.println("Enter Search Policy");
				String str = br.readLine();
				List<Integer>  pids = ins.searchBasedOnPolicyType(str);
				
				if(pids.isEmpty())
					System.out.println("No policies are existed");
				else
				{
					for(int pid : pids)
					{
						System.out.println(pid);
					}
				}
				break;	
			case 3:
				Map<Integer, String>  vall = ins.ViewAll();
				for(Map.Entry<Integer, String>  temp : vall.entrySet())
				{
					System.out.println(temp.getKey() + " | " + temp.getValue());
				}
				break;
			case 4:
				System.out.println("Thanks for using this App");
				System.exit(0);
			}
		}
	}
}
