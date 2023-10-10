package Sorting;

import java.util.Comparator;

public class SortingBasedOnRollno implements Comparator<Student2>{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		// TODO Auto-generated method stub
		return Integer.compare(s1.getRollno(), s2.getRollno());
	}

}
