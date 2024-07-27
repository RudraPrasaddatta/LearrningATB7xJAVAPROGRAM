package ex_27072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Dattu");
        String s2 = new String("Dattu");
        // 2 Heap area
        String s3=s1;
        // 2 heap s3 -->>s1 -->>Dattu
        System.out.println(s3);

    }
}
