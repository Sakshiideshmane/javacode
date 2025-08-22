package ArrayList;

public class FindMiximum {

	public static void main(String[] args) {
		int[] array = {15, 42, 73, 9, 31, 88, 54};
		
		int max = array[0];
		
		for(int num : array) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("Array: ");
		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("\nMaximum Element: "+ max);

	}

}
