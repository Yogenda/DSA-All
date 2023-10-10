package ColletionPack;

import java.util.*;

public class SearchItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> arrList = new ArrayList<String>();
		arrList.add("Pushpa");
		arrList.add("Yogendra");
		arrList.add("Venugopal");
		arrList.add("Krishna");
		arrList.add("Pushpa");
		
		System.out.println(arrList);
		
	System.out.println("--------------");
	System.out.println("Enter a string to search ");
	String str = sc.next();
	
	if(arrList.contains(str))
		System.out.println("Existed...");
	else
		System.out.println("Not Existed");
	}

}
