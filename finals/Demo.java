import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
       String x = sayHello();
       System.out.print(x + ", Andy");
        double y = addTwoNum(1,1);
        System.out.println(y);

    }   

    public static String sayHello()
    {
        return "Hello";
    }

    public static double addTwoNum(int a, int b)
    {
        return a + b;
    }
}
