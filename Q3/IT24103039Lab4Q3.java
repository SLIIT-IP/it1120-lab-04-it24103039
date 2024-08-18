import java.util.Scanner;
public class IT24103039Lab4Q3 {
    public static void main(String[] args) {

	//Create an object called input to Scanner class
	Scanner input= new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

	String result = (number>0) ? "Positive" : (number<0)? "Negative" : "Zero";
	System.out.println("The number is: " + result);
     }
}

	