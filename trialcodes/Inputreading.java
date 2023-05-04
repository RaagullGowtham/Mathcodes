package trialcodes;
import java.util.Scanner;
public class Inputreading{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = a;
		if(b > a) {
			max = b;
			}
		if(c > b) {
			max = c;
		}
		System.out.println(max);
		
//		System.out.println(in.next().trim());
		
//		String name = "Gowtham";
//		System.out.println(name.charAt(0));
		
//		char ch = in.next().trim().charAt(0);
////		
//		if(ch >= 'a' && ch <='z') {
//			System.out.println("Lowercase");
//	}
//		else{
//			System.out.println("Uppercase");
//		}
////		System.out.println(ch);
}
}
//	