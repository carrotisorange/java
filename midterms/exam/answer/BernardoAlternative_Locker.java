import java.util.Scanner;
public class BernardoAlternative_Locker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number of lockers: ");
        int numberOfLockers = console.nextInt();

        System.out.println("The number of lockers and students are: " + numberOfLockers);
        System.out.print("The locker numbers left open at the end of the game are: ");

        for (int i = 1; i <= Math.sqrt(numberOfLockers); i++) {
            System.out.print(i * i+", ");
        }
    }
}
