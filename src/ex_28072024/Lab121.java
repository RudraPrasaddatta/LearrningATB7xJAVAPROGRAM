package ex_28072024;

public class Lab121 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++)  //i=0 to 9, It will run in 10 times
        {
            System.out.println(i);
            if ( i==5) {
                continue;
            }
            System.out.println("continue");
        }


    }
}
