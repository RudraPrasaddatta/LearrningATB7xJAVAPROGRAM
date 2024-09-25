package ex_28072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the browser name: ");
        String Browser = sc.next();
        switch (Browser.toLowerCase())
        {
            case "chrome" :
            {
                System.out.println("Chrome Browser is opening");
                break;
            }
            case "firefox" :
            {
                System.out.println("Firefox browser is opening");
                break;
            }
            case "edge" :
            {
                System.out.println("edge browser is opening");
                break;
            }
            default:
            {
                System.out.println("default is loading");
            }


        }

    }
}
