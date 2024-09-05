package myFirstProgram;
import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		ArrayList<Double> array = new ArrayList();
		int sizeOfArray;
		Scanner scanner = new Scanner(System.in);
		sizeOfArray = scanner.nextInt();
		for (int i = 0; i < sizeOfArray; i++)
		{
			array.add(i, scanner.nextDouble());
		}
		System.out.println(SelectionSort(array));
	}
	
	static ArrayList<Double> SelectionSort(ArrayList<Double> array)
	{
		Double min;
		int indexOfMin = 0;
		for (int i = 0; i < array.size(); i++)
		{
			min = Double.MAX_VALUE;
			for (int j = i; j < array.size(); j++)
			{
				if (min > array.get(j))
				{
					min = array.get(j);
					indexOfMin = j;
				}
			}
			array.set(indexOfMin, array.get(i));
			array.set(i, min);
		}
		return array;
	}
}
		