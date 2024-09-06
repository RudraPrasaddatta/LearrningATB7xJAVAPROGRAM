package ex_28072024;

import java.util.Scanner;

public class Lab88 {
    public static void main(String[] args) {
        //maximum number in two inputs

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1=sc.nextInt();

        System.out.println("Enter number2");
        int num2= sc.nextInt();
// system.out.println(Math.max (num1,num2);

        if (num1>num2)
        {
            System.out.println(num1+"  ---> is max number");
        }
        else if (num2>num1)
        {
            System.out.println(num2+"----> is max number");
        }
        else {
            System.out.println("Both are equal");
        }


    }
}
