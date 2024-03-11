class NoThis{
    int a =10;

    NoThis(int a)
    {
        a = a; // Instance variable hidden by Local Variabke ;
    }
    void show()
    {
        System.out.println("Value of a: "+ a);
    }
}
class WithThis{
    int a = 10;

    WithThis(int a)
    {
        this.a = a; // This points to Instance Variable not Local
    }
    void show()
    {
        System.out.println("Value of a: "+a);
    }

    WithThis()
    {
        this(5); //Calling parameterized constructor of current class ;
        this.show(); //Calling a method of current class
    }
}
class Prac8{
    public static void main(String args[])
    {
        System.out.println("Without This: ");
        NoThis objNo = new NoThis(5);
        objNo.show();

        System.out.println("With This: ");
        WithThis objThis = new WithThis();
    }
}