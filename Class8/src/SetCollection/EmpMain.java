package SetCollection;
import java.util.*;
public class EmpMain {

	public static void main(String[] args) {
		Set<Employee>  setEmp = new HashSet<Employee>();
		Employee emp = null;
		Scanner sc = new Scanner(System.in);
		do
		{
			emp = new Employee();
			System.out.println("Emp Number ");
			emp.setEmpno(sc.nextInt());
			System.out.println("Emp Name ");
			emp.setEname(sc.next());
			System.out.println("Emp Job ");
			emp.setJob(sc.next());
			System.out.println("Emp Salary ");
			emp.setSal(sc.nextFloat());

			
			setEmp.add(emp);
			
			System.out.println("1 more emp(y/n)");
			String ch = sc.next();
			
			if(ch.equalsIgnoreCase("n"))
				break;
		}
		while(true);
		
		
		System.out.println(setEmp);
		System.out.println("---------------");
		
		for(Employee e:setEmp)
			System.out.println(e);
		
		System.out.println("---------------");
		
		for(Employee e:setEmp)
		{
			System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getJob() + "\t" + e.getSal());
		}
		
	}

}
