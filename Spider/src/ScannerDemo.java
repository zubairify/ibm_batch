import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = console.next();
		
		String namePattern = "[A-Z][a-z]{3,}";
		System.out.println("Your name is " + (name.matches(namePattern)?"Valid":"Invalid"));
		
		System.out.print("Enter Mobile No: ");
		String mobile = console.next();
		
		String mobilePattern = "[7-9][0-9]{9}";
		System.out.println("Mobile No is " + (mobile.matches(mobilePattern)?"Valid":"Invalid"));
		
		System.out.print("Enter Age: ");
		
		
		console.close();
	}
}
