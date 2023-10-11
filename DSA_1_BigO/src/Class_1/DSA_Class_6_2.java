package Class_1;

import java.util.*;

// 
public class DSA_Class_6_2 {

//	public static void compressBoxesTwice(int[] boxes) {
//		for (int box : boxes) {
//			System.out.println(box);
//		}
//
//		for (int box : boxes) {
//			System.out.println(box);
//		}
//	}
	
	//------------------------
	
	public static void compressBoxesTwice(int[] boxes, int[] boxes2) {
        // Iterate through the elements in the first array (boxes)
        for (int box : boxes) {
            System.out.println(box);
        }
        
        // Iterate through the elements in the second array (boxes2)
        for (int box : boxes2) {
            System.out.println(box);
        }
    }

	public static void main(String[] args) {
//		int[] boxes = { 1, 2, 3, 4, 5 };
//		compressBoxesTwice(boxes);
		//-----------------
		int[] boxes = {0, 1, 2, 3, 4, 5};
        int[] boxes2 = {6, 7, 8, 9, 10};
        compressBoxesTwice(boxes, boxes2);
		
	}

}
