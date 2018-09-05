import java.util.Scanner;
public class TwoIntegersRunner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int value = input.nextInt();
		System.out.print("Enter another number: ");
		int value2 = input.nextInt();
		//System.out.print(value + " + " + value2);

		TwoIntegers twointegers = new TwoIntegers(value, value2);
		String arithmetic = twointegers.arithmetic();
		boolean multiple = twointegers.isMultiple();
		
		System.out.println(multiple);
		
		

	}

}
