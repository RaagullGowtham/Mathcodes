package trialcodes;

public class Swap {
public static void main(String[] args) {
	
	int a = 10;
	int b = 20;
//	//Swap numbers code
//	int temp = a;
//	a = b;
//	b = temp;

	//does not swap
	swap(a,b);
	System.out.println(a + " " + b);
}

static void swap(int a, int b) {
   int temp = a;
   a = b;
   b = temp;
}
}
