import java.util.Scanner ;

class Prac2{

    public static void max(int a, int b, int c){
        System.out.println((a==b & b==c )?"All are equal":( " Max of "+a+", "+b+", "+c+" is "+ ((a>b & a>c)?a:b>c?b:c)));
    }

    public static void main(String args[]){
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Value : ");
        a = sc.nextInt();
        
        System.out.print("Enter Second Value : ");
        b = sc.nextInt();
        
        System.out.print("Enter Third Value : ");
        c = sc.nextInt();
    
        max(a, b, c);
    }
}