class Demo{
    int x;
    Demo()
    {
        System.out.println("No argument constructor called.");
    }
    Demo(int a)
    {
        System.out.println("Parameterized Constructor called.");
        x = a;
    }
}

class Prac12{
    public static void main(String args[])
    {
        Demo d1=new Demo();
        System.out.println("Value of x: "+d1.x); // No argument constructor
        
        // Constructor Overloaded
        
        d1 = new Demo(10);
        System.out.println("Value of x: "+d1.x); // Parameterized Constructor
    }
}