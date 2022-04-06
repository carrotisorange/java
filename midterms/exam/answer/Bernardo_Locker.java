import java.util.Scanner;

public class Bernardo_Locker{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of lockers: ");
        int numberOfLockers = console.nextInt();

        System.out.println("The number of lockers and students are: " + numberOfLockers);
        System.out.print("The locker numbers left open at the end of the game are: ");

        for (int x = 1; x <= numberOfLockers; x++) {
            int studentVisitCount = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    studentVisitCount++;
                }
            }
            if (studentVisitCount % 2 != 0) {
                System.out.print(x + " ");
            }
        }
    }
}
