import java.util.Scanner;

public class Name
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your last and first name: ");
		String fullName = kb.nextLine();
		int position = fullName.indexOf(",");
		String lName = fullName.substring(0,position);
		String lastName = lName.substring(0,1).toUpperCase() + lName.substring(1).toLowerCase();
		String fName = fullName.substring(position+1);
		String firstName = fName.substring(0,1).toUpperCase() + fName.substring(1).toLowerCase();
    	System.out.println("Your full name is: " + firstName +" " + lastName);

	}
}
