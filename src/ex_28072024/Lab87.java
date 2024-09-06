package ex_28072024;

import java.util.Scanner;

public class Lab87 {
    public static void main(String[] args) {
        // Take user input and check number id is even or odd
        //Logic building

        //figure our input  -- > How to take input  --> Scanner class
        //figure which data type/  --int
        //Do we need conversion directly
        //Rough logic
        //Optimisation
        Scanner sc = new Scanner(System.in); // Object of the class--oops
        System.out.println("Enter user number");
        int given_num = sc.nextInt();
        System.out.println(given_num);
        if (given_num==0)
        {
            System.out.println("Even");
        }
else {
            System.out.println("Odd");
        }


    }
}
