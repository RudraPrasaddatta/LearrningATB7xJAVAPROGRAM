package ex_27072024;

public class Lab059 {
    public static void main(String[] args) {
        int course =100;
        float gst = 15.455f;
        int total_price = course+(int)gst; // implici narrowing --JVM not allow
        System.out.println(total_price);  // REAL time example money loss






    }
}
