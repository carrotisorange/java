import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Bernardo_Figure {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Menu: Compute Area of ");
        System.out.print("\n1. Trapezoid\n2. Ellipse\n3. Equilateral Triangle\nChoice: ");
        int choice = kbd.nextInt();

        switch(choice)
        {
            case 1: 
                    System.out.print("Trapezoid");
                    System.out.print("\nEnter h: ");
                    double h = kbd.nextDouble();
                    System.out.print("Enter b1: ");
                    double b1 = kbd.nextDouble();
                    System.out.print("Enter b2: ");
                    double b2 = kbd.nextDouble();
                    System.out.print("Area of Trapezoid is " + df.format(((b1+b2)/2)*h));
                    break;
            case 2:
                    System.out.print("Ellipse");
                    System.out.print("\nEnter r1: ");
                    double r1 = kbd.nextDouble();
                    System.out.print("Enter r2: ");
                    double r2 = kbd.nextDouble();
                    System.out.print("Area of Ellipse is " + df.format(Math.PI * (r1*r2)));
                    break;
            case 3:
                    System.out.print("Equilateral Triangle");
                    System.out.print("\nEnter a: ");
                    double a = kbd.nextDouble();
                  
                    System.out.print("Area of Equilateral Triangle is " + df.format((Math.sqrt(3) * (Math.pow(a, 2)))/4));
                    break;

            default: System.out.print("Invalid choice!");
        }

    }
}
