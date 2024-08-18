import java.util.Scanner;
public class IT24103039Lab4Q2 {
    public static void main(String[] args) {

	//Create an object called input to Scanner class
	Scanner input= new Scanner(System.in);

	//Getting exam marks from user
	System.out.print("Please enter exam marks (out of 100): ");
	double examMarks = input.nextDouble();

	if(examMarks<0 || examMarks>100) {
	System.out.print("Invalid input for exam marks. Terminating program.");
	return;} //Exiting the program 

	//Getting lab submission marks from user 
	System.out.print("Please enter lab submission marks (out of 100): ");
	double labMarks = input.nextDouble();

	if (labMarks<0 || labMarks>100) {
	System.out.print("Invalid input for lab submission marks. Terminating program."); 
	return;} //Exiting the program 
	
	
	//Getting the exam percentage from user
	System.out.print("please enter the percentage given for the exam: ");
	double examPercentage = input.nextDouble();

	//Getting the labsubmissionpercentage from user
	System.out.print("Please enter the percentage given for the lab submission: ");
	double labPercentage = input.nextDouble();

	if (examPercentage + labPercentage > 100) {
	System.out.print("The percentage must add up to 100. Terminating program.");
	return; }
	
	
	//Calculating the final marks
	double finalMarks=(examMarks*examPercentage/100)+(labMarks*labPercentage/100);

	//Displaying the final marks 
	System.out.println("Final exam marks is: " + finalMarks);
	
	}
}
	

		