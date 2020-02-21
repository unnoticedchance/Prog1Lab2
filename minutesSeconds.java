import java.util.Scanner;
 public class minutesSeconds {
 public static void main(String[] args)
    {
        Scanner sd = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = sd.nextInt();
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        System.out.println( p2 + ":" + p1);
    }
 }