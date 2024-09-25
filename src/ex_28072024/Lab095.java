package ex_28072024;

import testPractice.ScannerClassTest;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user If it is Vowel or not
       Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character to check wheather it is Vowel or not");
       char user_input =sc.next().charAt(0);
       switch (user_input) {
           case 'a': {
               System.out.println("Vowel");
               break;
           }
           case 'e': {
               System.out.println("Vowel");
               break;
           }
           case 'i': {
               System.out.println("Vowel");
               break;
           }
           case 'o': {
               System.out.println("Vowel");
               break;
           }
           case 'u': {
               System.out.println("Vowel");
               break;
           }
           default : {
               System.out.println("Not a Vowel");
           }
       }
       }

    }

