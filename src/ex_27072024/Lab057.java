package ex_27072024;

public class Lab057 {
    public static void main(String[] args) {
        //Type casting  - Source and distination coversion
        // widening, narrowing both ar ehaving  impmici and explicy , but narroing has loss

        //Widening
        byte a=10;
        int b=a; //implicity casting , JVM will do,
        int b1= (int)b;  //valid - Explicit casting
        System.out.println(b1);

        // Narrowing
        int val=300; // Invalid impmicit casting
        byte b12=(byte)val;  // explicit casting valid  // Loss of data
        System.out.println(b12);

    }
}
