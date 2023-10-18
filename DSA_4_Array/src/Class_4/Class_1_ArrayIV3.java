package Class_4;

import java.util.*;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/

public class Class_1_ArrayIV3 {
	public static void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			// If the current element is non-zero
			if (nums[i] != 0) {
				// Swap it with the first zero element (if any)
				int temp = nums[nonZeroIndex];
				nums[nonZeroIndex] = nums[i];
				nums[i] = temp;
				nonZeroIndex++;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);

		System.out.print("Resulting Array: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
