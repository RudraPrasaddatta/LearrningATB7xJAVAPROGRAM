package ex_20072024;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to get a triangle");
        int no = scan.nextInt();
        for (int i = 1; i <= no; i++) {

            for (int j = no; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

            }


    }
}

