package ex_27072024;

import java.util.Locale;

public class Lab068 {
    public static void main(String[] args) {
        String name1 =  "Rudra";
        // Bunch of characters
        String name2= new String("Dattu");
        // How many ways we can a string>> 2
        //=, new operator
        //  "SCP" string constant pool
        //new -Objects (heap)
        System.out.println(name1.toLowerCase());
        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.charAt(2));
        //System.out.println(name1.charAt(10)); // Index out of boundary exception


    }
}
