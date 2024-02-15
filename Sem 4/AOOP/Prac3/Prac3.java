import java.util.Scanner ;

class Prac3{
    public static int rev(int num){

        int rev_num = 0, digit;
        while(num > 0){
            digit = num %10 ;
            num = num/10;
            rev_num = rev_num *10 + digit;
        }

        return rev_num;
    }

    
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value : ");
        num = sc.nextInt();

        System.out.println("Reverse of "+num+" is "+ rev(num));
    }
}