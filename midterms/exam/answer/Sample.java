

import java.util.Scanner;

public class Sample
{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Object system;
        System.out.print("Enter the number of lockers");

        int numberOfLockers = keyboard.nextInt();
        System.out.println("The number of lockers and students are:" + numberOfLockers);
        System.out.println("The locker numbers of lockers that are left open at the end of the game are: ");
        for (int x = 1; x <= numberOfLockers; x++) {
            int studentVisitCount = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0)
                    studentVisitCount++;
            }
            if (studentVisitCount % 2 != 0) {
                System.out.println(x + " ");
            }
        }

    }

}