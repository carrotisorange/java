import java.util.Scanner;
public class SortingNumbers {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        final int setOfNumbers = 5;

        System.out.println("Enter five numbers:");

        int num1 = kbd.nextInt();
        int num2 = kbd.nextInt();
        int num3 = kbd.nextInt();
        int num4 = kbd.nextInt();
        int num5 = kbd.nextInt();

        int sorted = 0;

        for(int i=0; sorted<setOfNumbers; i++)
        {
            int numberOfNumSorted = 0;

            if(i == num1)
            {
                sorted++;
                numberOfNumSorted++;
            }

            if (i == num2) {
                sorted++;
                numberOfNumSorted++;
            }

            if (i == num3) {
                sorted++;
                numberOfNumSorted++;
            }

            if (i == num4) {
                sorted++;
                numberOfNumSorted++;
            }

            if (i == num5) {
                sorted++;
                numberOfNumSorted++;
            }

            for(int j=0; j < numberOfNumSorted; j++)
            {
                System.out.print(i+", ");
            }

        }
    }
}
