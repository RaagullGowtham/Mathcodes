package trialcodes;
import java.util.Scanner;
public class Nestedswitch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int empId = in.nextInt();
		String department = in.next();
		
		switch (empId)	{
		case 1:
			System.out.println("Raagull");
			break;
		case 2:
			System.out.println("Gowtham");
			break;
		case 3:
			System.out.println("Emp number 3");
			switch (department) {
			case "IT":
				System.out.println("IT Department");
				break;
			case "Mechanical" :
				System.out.println("Mechanial Department");
				break;
			default :
				System.out.println("No Departmrnt Entered");
				
			}
			break;
			default :
			System.out.println("Enter correct EmpId");
		}
	}
}
