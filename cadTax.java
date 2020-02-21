import java.util.Scanner;

public class cadTax
{
	public static void main(String[] args)
	{
		Scanner sd = new Scanner(System.in);
		System.out.print("Enter amount in CAD: ");
		double cad = sd.nextDouble();
		double tax = cad * 0.15;
		double cTax = cad + tax;
		System.out.println("The amount of tax is: ", tax);
		System.out.println("The total amount to pay is: ", cTax);
	}
}