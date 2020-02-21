import java.util.Scanner;

public class Roadtrip
{
	public static void main(String[] args)
	{
		Scanner sd = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers: ");
		double distance = sd.nextDouble();
		System.out.print("Enter average distance with 1L of gas: ");
		double average = sd.nextDouble();
		double estimatedP = ((distance * average)/2) * 1.16;
		System.out.println("The estimated price of this roadtrip is: ", estimatedP);
	}
}