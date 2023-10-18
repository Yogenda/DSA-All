package Class_4;

import java.util.*;

/*
 * Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

public class Class_1_ArrayIV4 {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> seen = new HashSet<>();

		for (int num : nums) {
			if (seen.contains(num)) {
				return true; // If the element has been seen before, it's a duplicate
			}
			seen.add(num); // Add the element to the set
		}

		return false; // No duplicates found
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 1 };
		boolean result1 = containsDuplicate(nums1);
		System.out.println("Contains Duplicate in nums1: " + result1);

		int[] nums2 = { 1, 2, 3, 4 };
		boolean result2 = containsDuplicate(nums2);
		System.out.println("Contains Duplicate in nums2: " + result2);
	}

}
