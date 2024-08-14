import java.util.Scanner;
public class IT24103039Lab4Q1
{
    public static void main(String[] args)
    {

	//Create an object called input to Scanner class
	Scanner input = new Scanner(System.in);

	//Enter a number 
	System.out.print("Enter a number: ");
	
	// Read a nubmer from the keyboard
	double number  = input.nextDouble();

	if (number>0) {
	   System.out.print("The number is: positive");
	} else if (number<0) {
	   System.out.print("The number is: Negative");
	} else {
	   System.out.print("The number is Zero");
	}
     }
}


