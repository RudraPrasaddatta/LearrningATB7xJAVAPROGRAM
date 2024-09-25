package ex_28072024;

import graphql.schema.diffing.ana.SchemaDifference;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //Verify the positive or negitive numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no= sc.nextInt();
        if(no>0)
        {
            System.out.println("You have entered positive number");
        }
        else if (no<0)
        {
            System.out.println("You have entered negitive number");
        }
        else {
            System.out.println("you have entered value 0");

          }
        }
    }

