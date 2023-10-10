package Sorting;

public class StringSorting {

	public static void main(String[] args) {
		String  str[] = {"Kiran", "Baskar", "Amala", "Devdas","Mohan"};
		
		System.out.println("Actual Strings : ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i] + "  ");
		}
		
		/*
		 * compareTo() :-  
		 * str1.compareTo(str2)
		 * if first string is bigger than second string it returns >0
		 * if first string is smaller than second string it returns <0
		 * if first string and second string is same it returns 0
		 */
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
				
		System.out.println("\nSorted Strings in Asending Order : ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i] + "  ");
		}
	}

}
