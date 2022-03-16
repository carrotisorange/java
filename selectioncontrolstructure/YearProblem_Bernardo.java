package selectioncontrolstructure;

import java.util.Scanner;
public class YearProblem_Bernardo {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = kbd.nextInt();

        String output;

        if(year%100==0){
            output = "It is a century year.";
        }else{
            if(year%4==0){
                output = "It is a leap year.";
            }else{
                output = "It is not an ordinary year.";
            }
        }

        System.out.print(output);
     }
}
