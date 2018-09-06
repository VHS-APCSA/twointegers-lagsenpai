import java.util.Scanner;
public class TwoIntegersRunner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int value = input.nextInt();
		System.out.print("Enter another number: ");
		int value2 = input.nextInt();

		TwoIntegers twointegers = new TwoIntegers(value, value2);
		String arithmetic = twointegers.arithmetic();
		int largernum = twointegers.larger();
		boolean multiple = twointegers.isMultiple();
		
		System.out.println(arithmetic);
		System.out.println(largernum + " is the larger number.");
		System.out.println("Is " + value + " a multiple of " + value2 + ": " + multiple);

	}

}
