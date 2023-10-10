package Applications;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import BeanPack.Student;

public class TestApp1 {

	public static void main(String[] args) {
		Resource rs = new ClassPathResource("Config.xml");
		BeanFactory  bean = new XmlBeanFactory(rs);
		
		Student std = (Student) bean.getBean("stdObj");
		
		System.out.println("Roll Number : " + std.getRollno());
		System.out.println("Student Name : " + std.getSname());
		System.out.println("Course : " + std.getCourse());
		System.out.println("Fees " + std.getFees());
	}

}
