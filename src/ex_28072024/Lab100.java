package ex_28072024;

public class Lab100 {
    public static void main(String[] args) {
       char value ='B';
       int avalue = switch(value)
       {
           case 'A':
               yield 65;
           case 'B':
               yield  66;
           default:
               throw new IllegalStateException ("throwing the error");

       };
        System.out.println(avalue);
    }
}
