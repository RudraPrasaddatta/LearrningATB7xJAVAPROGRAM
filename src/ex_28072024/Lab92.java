package ex_28072024;

import java.util.Scanner;

public class Lab92 {
    public static void main(String[] args) {

        //Switch condition when more than 2 condition
        // Which day it is 1---Monday, 7----Sunday
        //3 Wednesday
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to get day");
       int day= sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thrusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("No idia");

        }
        System.out.println("Outside the switch loop");
    }
}
