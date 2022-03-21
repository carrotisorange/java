package arrays;
import java.util.Scanner;
public class ArrayReverseOrderNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] items = new int[3];
        int sum;

        System.out.println("Enter five integers:");
        sum = 0;
        //getting input
        for(int counter=0; counter<items.length; counter++)
        {
            items[counter] = console.nextInt();
            sum = sum + items[counter];
        }

        System.out.println("The sum of the numbers = " + sum);
        System.out.print("The numbers in reverse order are: ");

        for (int counter = items.length-1; counter >= 0; counter--) {
            System.out.print(items[counter] + " ");
        }






    }
}
