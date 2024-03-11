//final class
final class Demo1
{
    //final variable
    final int a = 10;
    
    //final method
    final void show()
    {
        System.out.println("Value of a: "+ a++); //This line will throw error "cannot assign a value to final variable"
    }
}

class Demo2 extends Demo1 //This line will throw error "cannot inherit from final class"
{
    void show() //This line will throw error "show() in Demo2 cannot override show() in Demo1"
    {
        System.out.println("Value of a: "+ a);
    }
}

class Prac10
{
    public static void main(String args[]){}
}