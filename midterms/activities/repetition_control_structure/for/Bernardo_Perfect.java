import java.util.Scanner;
public class Bernardo_Perfect {
    public static void main(String[] args) {
        
        Scanner kbd = new Scanner(System.in);
        
        int sum = 0;
        String label = "";

        System.out.print("Input N: ");
        int n = kbd.nextInt();

        if(n <= 1){
            System.out.print("Invalid N");
        }else
        {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }

                if (sum == n) {
                    label = "perfect";
                } else if (sum > n) {
                    label = "abundant";
                } else {
                    label = "deficient";
                }
            }

            System.out.print(n + " is " + label);
        }
 
    }
}
