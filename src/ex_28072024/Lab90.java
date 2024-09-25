package ex_28072024;

import java.util.Scanner;

public class Lab90 {
    public static void main(String[] args) {

        //Grade calculator Program
        //Write a program that calculates, and dislayes
        //the letter grade for a given numerical  score (e. g A B C, D, E, F)
        // A: 90-100;
//        B: 80-90;
//        C: 70- 80;
//        D: 60-70;
//        E: 50-60;
//        F: 40-50;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int score = sc.nextInt();
        if( score>=90 && score<100)
        {
            System.out.println("Your grade is 'A'");
        }
        else if (score>=80 && score<=90)
        {
            System.out.println("Your grade is  'B'");
        } else if (score>=70 && score <=80)
        {
            System.out.println(" your grade is 'c'");
        } else if (score>=60 && score<=70) {
            System.out.println("Your grade is 'D");

        } else if (score>=50 & score<=60) {
            System.out.println("Your grade is 'E'");
        } else if (score>=40 && score<=50) {
            System.out.println("Your grade is 'F");

        }
//        else if (score<=0 || score>100)
//        {
//            System.out.println("LoL !! Are you good?");
//            grade = 'O';
//        }
        else {
            System.out.println("You are failed");
        }

        }
    }

