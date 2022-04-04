import java.util.Scanner;
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = kbd.nextInt();
       
        System.out.print("Enter another number: ");
        int num2 = kbd.nextInt();
        
        int sum = num1 + num2;
      
        System.out.println("The sum is " + sum);
    }
}