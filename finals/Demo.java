import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
      double  x = divideNum();

      System.out.print(x);
    }

    public static void checkInput(double b)
    {
        if(b<=0)
        {
            System.exit(0);
        }else{
            divideNum();
        }
    }

    public static double divideNum()
    {   
        Scanner kbd = new Scanner(System.in);
        displayLabel();
        double a = kbd.nextDouble();
        displayLabel();
        double b = kbd.nextDouble();
        checkInput(b);
        return a/b;
    }

    public static void displayLabel()
    {
        System.out.println("Enter a number:");
    }
}
