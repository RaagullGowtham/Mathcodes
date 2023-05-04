package trialcodes;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fruit = in.next();
//
		switch (fruit) {
		case "Apple":
			System.out.println("a sweet red fruit");
			break;
		case "Mango":
			System.out.println("King of fruits");
			break;
		case "Pineapple":
			System.out.println("Aromatic fruit");
			break;
		case "Tomato":
			System.out.println("Not A fruit");
			break;
		default:
			System.out.println("Enter a valid fruit");
		}
//		
//		// Enhanced Switch
//		
//		switch (fruit) {
//		case  "Apple" ->System.out.println("A sweet red fruit");
//		case  "Mango" ->System.out.println("King of fruits");
//		case  "Pineapple" ->System.out.println("Aromatic fruit");
//		case  "Tomato" ->System.out.println("Not a fruit");
//		default ->System.out.println("Enter a valid fruit");
//		
//		}
//		int day = in.nextInt();
//		switch (day) {
//		case 1 -> System.out.println("Monday");
//		case 2 -> System.out.println("Tuesday");
//		case 3 -> System.out.println("Wednesday");
//		case 5 -> System.out.println("Thursday");
//		case 6 -> System.out.println("Friday");
//		case 7 -> System.out.println("Saturday");
//		}
	}

}
