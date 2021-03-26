
public class CmdLineDemo {

	public static void main(String[] args) {
//		for (String arg : args) 
//			System.out.println(arg);
		
		int sum = 0;
		for (String num : args) 
			sum += Integer.parseInt(num);
		
		System.out.println("Sum: " + sum);
		
		// Java Support Auto-Boxing
		int x = 10;
		Integer xo = x;	// Boxing
		Integer xc = 50;

		int total = xo + xc + x;	// Unboxing
		System.out.println(total);
	}
}
