package trialcodes;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
//		String message = greet();
//		System.out.println(message);
//	}
//	
//	static String greet() {
//		String greeting = "How's the day";
//		return greeting;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		String personalised = myGreet(name);
		System.out.println(personalised);
	}
	static String myGreet(String name) {
		String message = "Hi " + name;
		return message;
	}
	static String greet() {
		String greeting = "Epdi iruka";
		return greeting;
		
	}
}
