package myFirstProgram;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("print first number: ");
		Double firstNumber = scanner.nextDouble();
		System.out.print("print second number: ");
		Double secondNumber = scanner.nextDouble();

		int condition = 0;
		int arithmeticMethod = 10;
		
		while (condition == 0)
		{
			System.out.println(" print \n 0 for + \n 1 for -\n 2 for /\n 3 for *:");
			arithmeticMethod = scanner.nextInt();
			
			for (int i = 0; i < 4; i++)
			{
				if (arithmeticMethod == i)
				{
					condition++;
					break;
				}
			}
		}
		
		switch (arithmeticMethod)
		{
		case (0):
			System.out.println("result: " + (firstNumber + secondNumber));
			break;
		case (1):
			System.out.println("result: " + (firstNumber - secondNumber));
			break;
		case (2):
			System.out.println("result: " + (firstNumber / secondNumber));
			break;
		case (3):
			System.out.println("result: " + (firstNumber * secondNumber));
			break;
		}
	}

}
		