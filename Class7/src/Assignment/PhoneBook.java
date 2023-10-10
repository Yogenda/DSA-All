package Assignment;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	private List<Contact>  phonebook = new ArrayList<Contact>();

	public List<Contact> getPhonebook() {
		return phonebook;
	}

	public void setPhonebook(List<Contact> phonebook) {
		this.phonebook = phonebook;
	}
	
	public void addContact(Contact contactObj)
	{
		phonebook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts()
	{
		if(phonebook.isEmpty())
			return null;
		return phonebook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber)
	{
		Contact ct = null;
		
		for(Contact c : phonebook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
				ct = c;
				break;
			}
		}
		
		return ct;
	}
	
	public boolean removeContact(long phoneNumber)
	{
		boolean b = false;
		for(Contact c : phonebook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
				phonebook.remove(c);
				b = true;
				break;
			}
		}
		
		return b;
	}
	
}
