import java.util.Scanner;

public class Bernardo_Numbers {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Input an integer from 100,000 to 100,000,000: ");
        int a = kbd.nextInt();
        int b = a / 100 % 10;
        int c = a / 10 % 10;
        int d = a % 10;
        System.out.println("Last three digits of input: " + b + " " + c + " " + d);
        int e = (a - a % 1000) / 1000;
        System.out.println("Remaining number: " + e);
        int f = e + b + c + d;
        System.out.println("The sum of " + e + ", " + b + ", " + c + ", and " + d + " is : " + f);
        System.out.print("The sum in reverse is: ");
        for (int x = 1; x <= f; x = x * 10) {
            int g = f / x % 10;
            System.out.print(g + " ");
        }
    }
}
