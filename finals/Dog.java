public class Dog {
    public static void main(String[] args) {    
        double a = 10;
        double b = 2;

        double q = divideNum(a, b);

        System.out.print(q);
    }

    public static double divideNum(double a, double b)
    {
        double q = 0;
        if(isInputValid(b)){
            q = a / b;
        }
        return q;
    }

    public static boolean isInputValid(double b)
    {
        if (b == 0) {    
            return false;
        }else{
            return true;
        }
    }
}
