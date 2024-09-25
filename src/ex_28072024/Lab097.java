package ex_28072024;

public class Lab097 {
    public static void main(String[] args) {
        int no =7;
        switch (no)
        {
            case 001,002,003:
            {
                System.out.println("It is electronical gadget");
                break;
            }
            case 005,006,007:
            {
                System.out.println("It is mechanical gadget");
                break;
            }
            default: {
                System.out.println("None");
            }
        }
    }
}
