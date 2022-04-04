import java.util.Scanner;
import java.text.DecimalFormat;
public class Piggangay_SeriesParallel {

	public static void main(String[] args) {
		Scanner Piggangay = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		
		double resistor1, resistor2, resistor3, resistor4, totalS, totalP;
		
		System.out.print("Enter resistor 1: ");
		resistor1 = Piggangay.nextDouble();
		
		System.out.print("Enter resistor 2: ");
		resistor2 = Piggangay.nextDouble();
		
		System.out.print("Enter resistor 3: ");
		resistor3 = Piggangay.nextDouble();
		
		System.out.print("Enter resistor 4: ");
		resistor4 = Piggangay.nextDouble();
		
		System.out.print("Total Resistance ");
		
		totalS = resistor1 + resistor2 + resistor3 + resistor4;
		
		totalP = 1 / ((1 /resistor1) + (1 /resistor2) + (1 /resistor3) + (1 /resistor4));
				
		System.out.println("Series Connection: " + df.format(totalS) );
		
		System.out.println("Parallel Connection: " + totalP);
		
		
		
		
		
	}

}