import java.util.Scanner;
class Student{

    int enrol_num;
    String name;

    void showDetail(){
        System.out.println("Name: "+name);
        System.out.println("Enrollment: "+enrol_num);
    }
}
class Prac6{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Initialize S2 using Compile Time Values.");
        s1.name="Het";
        s1.enrol_num = 94 ;
        s1.showDetail();
        
        Student s2 = new Student();
        System.out.println("Initialize S2 using Scanner.");
        System.out.print("Enter name: ");
        s2.name = scanner.nextLine();
        System.out.print("Enter enrollment number: ");
        s2.enrol_num = scanner.nextInt();
        s2.showDetail();

        Student s3 = new Student();
        System.out.println("Initialize S2 using Command Line Input.");
        s3.name=args[0];
        s3.enrol_num=Integer.parseInt(args[1]) ;
        s3.showDetail();
    }
}