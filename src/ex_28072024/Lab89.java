package ex_28072024;

import java.util.Scanner;

public class Lab89 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:   ..>");
        int age= sc.nextInt();
        if(age>=18)
        {
            System.out.println("Your are eligible to enter Goa");
        }
        else if (age>=30){
            System.out.println("you are eligible to enter goa + Honey");
    }
    else {
            System.out.println("You are not eligible to enter Goa");
        }
    }
}
