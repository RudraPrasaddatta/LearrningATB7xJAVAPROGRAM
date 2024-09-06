package ex_28072024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        // Condition and Loop
        //Condition?
        //age>18 ----> You are allowed to vote
        //age>18.---> vote, else ...--> not allowed
        //condition --java----> switch, if

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int Age = input.nextInt();


        if (Age>=18)
        {
            System.out.println("You are allowed to cast vote");
        }
        else {
            System.out.println("You are not allowed to cast vote");
        }

        
    }
}
