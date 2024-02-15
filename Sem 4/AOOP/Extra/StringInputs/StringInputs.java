import java.util.Scanner;

class StringInputs{
    public static String getS(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        return scanner.nextLine();
    }

    public static void main(String args[]){
        String a = getS("Enter string: ");
        String b = args[0];

        String c = "Ello";
        String d = new String("Wrld !");

        System.out.println("Scanner input: "+a);
        System.out.println("CMD input: "+b);
        System.out.println("Compile Time-1 input: "+c);
        System.out.println("Compile Time-2 input: "+d);
    }
}