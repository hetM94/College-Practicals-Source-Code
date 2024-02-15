import java.util.Scanner;

class GetInputs {
    public static int getInt(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        return scanner.nextInt();
    }

    public static float getFloat(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        return scanner.nextFloat(); 
    }
    public static byte getByte(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(Message);
        return scanner.nextByte();
    }
    public static double getByte(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(Message);
        return scanner.nextByte();
    }
    public static void main(String[] args) {
        int testi;
        float testf;

        testi = getInt("Enter Integer: ");
        System.out.println("Value of integer: " + testi);

        testf = getFloat("Enter Float: ");
        System.out.println("Value of float: " + testf);
    }
}
