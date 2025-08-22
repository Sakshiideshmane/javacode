package ArrayList;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,2,5,3,6,7,8,3};
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int num : array) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		
		System.out.println("Original Array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("\nDuplicate Elements: " + duplicates);
	

	}

}
