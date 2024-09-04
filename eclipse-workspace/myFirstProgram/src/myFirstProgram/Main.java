package myFirstProgram;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		
//		int x = random.nextInt(6) + 10;
		double x = random.nextInt(6) + 10;
		
		System.out.println(x);
	}

}
