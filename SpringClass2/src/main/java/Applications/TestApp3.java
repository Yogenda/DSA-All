package Applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanPack.Employee;
import BeanPack.Student;

public class TestApp3 {

	public static void main(String[] args) {
		ApplicationContext bean = new ClassPathXmlApplicationContext("Config.xml");
		Employee emp = (Employee)bean.getBean("empObj");
		emp.PrintEmpDetails();
	}
}
