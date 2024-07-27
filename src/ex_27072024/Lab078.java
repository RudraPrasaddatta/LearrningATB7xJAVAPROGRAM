package ex_27072024;

public class Lab078 {
    public static void main(String[] args) {
        String Password ="Rudra@123";
        String pass_w = Password.toLowerCase();
        System.out.println(pass_w);
        // pass_w == password
        System.out.println(pass_w == Password);
        System.out.println(pass_w.equals(Password));
        System.out.println(pass_w.equalsIgnoreCase(Password));

        System.out.println(Password.substring(0,3));
        System.out.println(Password.indexOf('R'));


    }
}

