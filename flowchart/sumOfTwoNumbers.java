package flowchart;

//import the Scanner Class
import java.util.Scanner;
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        // set up the program to be ready to get keyboard
        // input by creating the scanner object
        Scanner kbd = new Scanner(System.in);
        // output a prompt message
        System.out.print("Enter a number: ");
        // read user input and store the input in variable num1
        int num1 = kbd.nextInt();
        // output a prompt message
        System.out.print("Enter another number: ");
        // read user input and store the input in variable num2
        int num2 = kbd.nextInt();
        // formula to add the two numbers
        int sum = num1 + num2;
        // display the sum
        System.out.println("The sum is " + sum);
    }
}