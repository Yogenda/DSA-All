package ColletionPack;

import java.util.*;

public class DeleteItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arrList = new ArrayList<String>();
		arrList.add("Pushpa");
		arrList.add("Yogendra");
		arrList.add("Venugopal");
		arrList.add("Krishna");
		arrList.add("Pushpa");
		
		System.out.println(arrList);
		
	System.out.println("--------------");
	System.out.println("Enter a string to Delete ");
	String str = sc.next();
	
	if(arrList.contains(str))
	{
		arrList.remove(str);
		System.out.println("List After Deletion : " + arrList);
	}
	else
		System.out.println("Not Existed");
	}
		
}
