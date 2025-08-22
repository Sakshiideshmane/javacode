package pattern;

public class NumberPyramid {

	public static void main(String[] args) {
		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
