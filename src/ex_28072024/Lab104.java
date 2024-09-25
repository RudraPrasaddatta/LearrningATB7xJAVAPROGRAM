package ex_28072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        //Program to find largest numbers among 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int no1 = sc.nextInt();
        System.out.println("Enter the second number");
        int no2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int no3 = sc.nextInt();

       if (no1>no2 && no1>no3) {
           System.out.println(no1+ "is greather");
       }
       else if (no2>no3){
           System.out.println(no2+ "is greather");
       }
       else {
           System.out.println(no3+ "is greather");
       }


    }
}
