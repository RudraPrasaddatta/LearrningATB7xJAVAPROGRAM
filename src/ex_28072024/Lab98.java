package ex_28072024;

public class Lab98 {
    public static void main(String[] args) {
        int item_code =8;
        char user_input ='d';
        switch (item_code)
        {
            case 001 -> System.out.println("This is mobile device");
            case 002-> System.out.println("This is Laptop device");
            case 003,004-> System.out.println("This is deskitop device");
            default -> System.out.println("None");
        }
        switch (user_input)
        {
            case 'a','e','i','o','u' -> System.out.println("It is vowel");
            default -> System.out.println("It is not a vowel");
        }
    }
}
