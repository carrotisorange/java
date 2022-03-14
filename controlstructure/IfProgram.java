package controlstructure;

import java.util.Scanner;

public class IfProgram {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter Number:");
        int voter_age = kbd.nextInt();

        // int voter_age = 18;

        // conditional check for age criteria
        if (voter_age >= 18) {
            System.out.println("Voter is eligible to vote");
        }

        else {
            System.out.println("Voter is not eligible to vote");
        }

    }

}