public class SampleLogicalExpressions {
    public static void main(String[] args) {
        boolean found = true;
        double hours = 45.30;
        double overTime = 15.00;
        int count = 20;
        char ch = 'B';

        //Expressions
        System.out.println
        (
            "!found: " + !found + 
            "\n" + "hours > 40.00: " + (hours>40.00) +
            "\n" + "!found && (hours>=0): " + (!found && (hours >= 0)) + 
            "\n" + "!(found && (hours>=0)): " + (!(found && (hours >= 0))) + 
            "\n" + "hours + overTime <= 75.00: " + (hours + overTime <= 75.00) + 
            "\n" + "(count >= 0) && (count<=100): " + ((count >= 0) && (count <= 100)) + 
            "\n" + "'A' <= ch && ch <= 'Z'): " + ('A' <= ch && ch <= 'Z') 
        );
    }
}
