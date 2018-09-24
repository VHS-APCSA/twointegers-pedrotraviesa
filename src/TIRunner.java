import java.util.Scanner;
public class TIRunner 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer");
		int num1 = input.nextInt();
		System.out.println("Enter second integer");
		int num2 = input.nextInt();
		TwoIntegers twoIntegers = new TwoIntegers(num1, num2);
		String arithmetic = twoIntegers.arithmetic(num1, num2);
		System.out.println(arithmetic);
		int larger1 = twoIntegers.larger();
		System.out.println(larger1 + " is the larger integer ");
		boolean isEven1 = twoIntegers.isEven();
		System.out.println("The sum of integer 1 and integer 2 is even. " + isEven1);
		boolean isMult1 = twoIntegers.isMult();
		System.out.println("Integer 1 is a multiple of integer 2. " + isMult1);
	}
}
