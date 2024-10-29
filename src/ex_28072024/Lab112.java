package ex_28072024;

public class Lab112 {
    public static void main(String[] args) {
       final boolean b1 = true;
        System.out.println(b1);
   // b1 final this is fixed now
        System.out.println(b1);
        //for (int i=0; ;)
        //infinite{}
        //for (; ; ;)
        //infinite{}

        for (float f=0; f<10.67;f++)
        {
            System.out.println("Hi, Float >" +f);
        }
        System.out.println();
        for (byte f=0; f<10.67;f++)
        {
            System.out.println("Hi, Float >" +f);
        }

    }
}
