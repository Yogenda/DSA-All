package Assignment;

import java.util.List;
import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneBook pb = new PhoneBook();
		while(true)
		{
			System.out.println("1. Add Contact\n2. View All Contacts\n3. Search Contact by Phone\n4. Remove Contact by Phone\n5. Exit");
			System.out.println("Pick An Option");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("First Name :");
				String fname = sc.next();
				System.out.println("Last Name :");
				String lname = sc.next();
				System.out.println("Phone Number :");
				long phone = sc.nextLong();
				System.out.println("Email :");
				String email = sc.next();
				Contact ct = new Contact(fname, lname, phone, email);
				pb.addContact(ct);
				System.out.println("Contact Added....");
				System.out.println("---------------");
				break;
			case 2:
				List<Contact>  viewall = pb.viewAllContacts();
				if(viewall!=null)
				{
					for(Contact c : viewall)
					{
						System.out.println(c.getFirstName() + "\t" + c.getLastName() + "\t" + c.getEmailId() + "\t" + c.getPhoneNumber());
					}
				}
				else
					System.out.println("Empty Phone Book");
				System.out.println("---------------");
				break;
			case 3:
				System.out.println("Phone Number to Search : ");
				long ph = sc.nextLong();
				Contact c =  pb.viewContactGivenPhone(ph);
				if(c!=null)
				{
					System.out.println(c.getFirstName() + "\t" + c.getLastName() + "\t" + c.getEmailId() + "\t" + c.getPhoneNumber());
				}
				else
					System.out.println("Contact Not Found");
				System.out.println("---------------");
				break;
			case 4:
				System.out.println("Phone Number to Delete Contact : ");
				ph = sc.nextLong();
				
				if(pb.removeContact(ph)==true)
					System.out.println("Contact Deleted...");
				else
					System.out.println("Contact Not Found");
				System.out.println("---------------");
				break;
			case 5:
				System.out.println("Thanks for Using App");
				System.exit(0);
			}
		}
	}

}
