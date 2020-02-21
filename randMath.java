import java.util.Random;

public class randMath
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int randNum = rand.nextInt(100);
		System.out.println("Random number between 1 to 100 is: " + randNum);
		int a1 = 2;
		int a2 = 3;
		double p1 = Math.pow(randNum, a1);
		System.out.println("Result power of 2: ", p1);
		double p2 = Math.pow(randNum, a2);
		System.out.println("Result power of 3: ", p2);
		double p3 = Math.sqrt(randNum);
		System.out.println("Square root of result: ", p3);
		double p4 = Math.log(randNum);
		System.out.println("Logarithm of result: ", p4);
		double p5 = Math.log(randNum) / Math.log(10);
		System.out.println("Logarithm base 10 of result: ", p5);
	}
}