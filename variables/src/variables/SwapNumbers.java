package variables;
// Swap number by using command line argument
public class SwapNumbers {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("Before Swapping: a="+a+ ",b="+b);
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping: a="+a+ ",b="+b);
		
	}

}
