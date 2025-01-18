import java.util.Scanner;

public class MaxNum {
  public static void main(String[] args) {
    // Create a Scanner object for input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter two numbers
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();

    // Use the ternary operator to find the maximum
    int max = (num1 > num2) ? num1 : num2;

    // Display the result
    System.out.println("The maximum of the two numbers is: " + max);

    // Close the scanner
    scanner.close();
  }
}

/*
 * OUTPUT:
 * Enter the first number: 10
 * Enter the second number: 20
 * The maximum of the two numbers is: 20
 * 
 * Enter the first number: 43
 * Enter the second number: 65
 * The maximum of the two numbers is: 65
 */