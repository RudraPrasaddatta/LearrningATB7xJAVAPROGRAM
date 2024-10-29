package ex_28072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        //5!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to get..");
        int no= sc.nextInt();

        int i=1;  //no=5, i=1; = 1*2*3*4*5
        //3!=1*2*3
        for(int j=1;j<=no;j++)
        {
            i=i*j;
        }
        System.out.println(i);
        sc.close();

    }
}
