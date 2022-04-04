import java.util.Scanner;

public class Bernardo_Ulam {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = kbd.nextInt();

        String result = "" + n;
        while (n > 1) {
            if (n % 2 == 0) { // if even
                n = n / 2;
            } else { // if odd
                n = 3 * n + 1;
            }
            result = result + ", " + n;
        }
        System.out.print(result);

    }
}
