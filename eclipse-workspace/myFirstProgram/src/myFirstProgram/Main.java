package myFirstProgram;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("a: ");
		Double a = scanner.nextDouble();
		
		System.out.println();
		
		System.out.print("b: ");
		Double b = scanner.nextDouble();
		
		System.out.println("\n");
		
		Double c;
		c = Math.sqrt(a*a + b*b);
		System.out.println("c: " + c);
	}

}
