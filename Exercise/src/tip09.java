import java.util.Scanner;
public class tip09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + 
		" minutes and " + remainingSeconds + " seconds");
	}

}
