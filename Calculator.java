import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("\nWelcome to the Calculator");
			System.out.println("Enter '+' for Addition");
			System.out.println("Enter '-' for Subtraction");
			System.out.println("Enter 'x' to Exit");
			System.out.println("Choose an operation: ");
			
			char choice = scanner.next().charAt(0);
			
			if(choice == 'x' || choice == 'X'){
				System.out.println("Exiting the Calculator!!");
				break;
			}

			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble();

			System.out.println("Enter the second number");
			double num2 = scanner.nextDouble();

			switch(choice){
				case '+':
					System.out.println("Result: " + (num1 + num2));
					break;
				case '-':
					System.out.println("Result: " + (num1 - num2));
					break;
				default:
					System.out.println("Invalid choice. Please choice a valid operation.");
			}
		}
		
		scanner.close();
	}
}
				

