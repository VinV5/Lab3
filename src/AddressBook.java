import java.util.List;

public class AddressBook {

	public List<BuddyInfo> l;
	
	public void addBuddy(BuddyInfo contact)
	{
		if (contact != null)
		{
			l.add(contact);
		}
	}
	
	public void removeBuddy(BuddyInfo contact)
	{
		l.remove(contact);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Address Book");
		
		AddressBook book = new AddressBook();
		
		BuddyInfo friend = new BuddyInfo();
		book.addBuddy(friend);
		book.removeBuddy(friend);
	}
}
