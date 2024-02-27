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
    public static double getS(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(Message);
        return scanner.nextLine();
    }
    public static double getCh(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(Message);
        return scanner.nextChar();
    }
}