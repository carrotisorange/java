import java.util.Scanner;
import java.text.DecimalFormat;
public class Bernardo_SeriesParallel {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double r1, r2, r3, r4, series_connection, parallel_connection;

        System.out.println("Resistor Computation");

        System.out.print("Enter resistor1:");
        r1= kbd.nextDouble();

        System.out.print("Enter resistor2:");
        r2 = kbd.nextDouble();

        System.out.print("Enter resistor3:");
        r3 = kbd.nextDouble();

        System.out.print("Enter resistor4:");
        r4 = kbd.nextDouble();

        series_connection = r1 + r2 + r3 + r4;

        parallel_connection = 1/(1/(r1) + 1/(r2) + 1/(r3) + 1/(r4));

        System.out.println("\nTotal Resistance: ");

        System.out.print("\nSeries Connection: " + df.format(series_connection));

        System.out.print("\nParallel Connection: " + df.format(parallel_connection));
    }   
}
