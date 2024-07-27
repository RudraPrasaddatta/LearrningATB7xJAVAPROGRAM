package ex_27072024;

public class Lab074 {
    public static void main(String[] args) {
            String name ="The testing academy"; //scp
            String name2= "The testing academy"; //scp
        System.out.println(name == name2);  // check for ref
        System.out.println(name.equals(name2)); // check for the content

        //ref
        String name3 = new String("The testing academy");
        System.out.println(name == name3); // check for ref
        System.out.println(name.equals(name3)); // check for content
    }

}
