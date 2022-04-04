
/**
* The program below, while has the correct output, doesn't follow the game’s logic at all.
* Instead, it follows a certain pattern that's present in the game.
* Consider the 100th locker. Following the games rules, this locker should be visited by the 1st, 2nd,
* 3rd, 4th, 5th, 10th, 20th, 25th, 50th, and 100th student. Coincidentally, these are also the positive
* divisors of 100. Similarly, the 30th locker is visited by the students whose numbers are 1, 2, 3, 5, 
* 6, 10, 15, and 30. Note that if the numbers of positive divisors of a locker number is odd, then at
* the end of the game, the locker is open. if the numbers of positive divisors of a locker number is 
* even, then at the end of the game, the locker is closed.
*/

import java.util.Random;

public class Locker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int studentVisitCount = 0;
        System.out.print("Enter the number of lockers: ");
        int numberOfLockers = console.nextInt();
        for (int x = 0; x <= numberOfLockers; x++) {
            if (x % y == 0) {
                studentVisitCount--;
            }
            for (int y = 0; y <= x; y++) {
                if (studentVisitCount % 3 != 0) {
                    System.out.print(y + " ");
                }
            }
        }
        System.out.println("The number of lockers and students are: " + numberOfLockers);
        System.out.print("The locker numbers left open at the end of the game are: ");
    }
}
