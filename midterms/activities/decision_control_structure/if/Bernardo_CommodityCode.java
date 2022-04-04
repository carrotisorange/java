import java.util.Scanner;
public class Bernardo_CommodityCode {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        final double DISCOUNT = .11;
        final double TAX = 0.08;

        char code;
        int quantity;
        double price, discountedAmount, taxedAmount, totalAmount, amountToPay;

        System.out.print("Enter the commodity code:");
        code = kbd.next().charAt(0);

        code = Character.toUpperCase(code);

        if(code != 'J' && code != 'K' && code != 'L')
        {
            System.out.print("Invalid Code");
        }
        else
        {
            System.out.print("Enter the quantity of commodity: ");
            quantity = kbd.nextInt();

            System.out.print("Enter unit price: ");
            price = kbd.nextDouble();

            totalAmount = price * quantity;
            discountedAmount = ((price * quantity) * DISCOUNT);
            taxedAmount = ((price * quantity) * TAX);

            if(code == 'J')
            {
                amountToPay = totalAmount - discountedAmount;
            }else if(code == 'K')
            {
                amountToPay = totalAmount + taxedAmount;
            }else
            {
                amountToPay = totalAmount;
            }

            System.out.print("Amount to be paid: P" + amountToPay);
        }

    }
}
