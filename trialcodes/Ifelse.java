package trialcodes;

public class Ifelse {
	public static void main(String[] args) {
		
		int salary = 25000;
		
		if(salary>30000){
			salary = salary + 5000;
		}
		else if(salary>20000) {
			salary+= 3000;
		}	
		else {
			salary += 1000;
		}
		
		System.out.println(salary);
	}
}
