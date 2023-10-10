package Sorting;

import java.util.Comparator;

public class SortingBasedOnFees implements Comparator<Student2>{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		// TODO Auto-generated method stub
		return (int)Float.compare(s1.getFees(), s2.getFees());
	}
}
