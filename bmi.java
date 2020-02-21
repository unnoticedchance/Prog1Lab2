import java.util.Scanner;
public class bmi {
   public static void main(String args[]) {
      Scanner sd = new Scanner(System.in);
      System.out.println("Input weight in pounds: ");
      double pound = sd.nextDouble();
      double weight = pound * 0.454;
      System.out.println("Input height in feet: ");
      double feet = sd.nextDouble();
      double height = feet * 0.3048;
      double BMI = weight / (height * height);
      System.out.println("The weight in kg is: " + weight + " The height in M is: " + height + " The BMI is " + BMI + " kg/m2");
   }
}