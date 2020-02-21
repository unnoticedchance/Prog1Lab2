import java.util.Scanner;
public class averageCelcius {
public static void main(String args[]) {

	Scanner sd = new Scanner(System.in);
	System.out.println("Input tempature from the past day in Celcius: ");
	int celcius1 = sd.nextInt();
	System.out.println("Input tempature from two days ago in Celcius: ");
	int celcius2 = sd.nextInt();
	System.out.println("Input tempature from three days ago in Celcius: ");
	int celcius3 = sd.nextInt();

	int sum = celcius1 + celcius2 + celcius3;
	double average = sum / 3;

    System.out.println("The average tempature of the past 3 days is: " + average);
 }
}
