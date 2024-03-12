class A {
    void display(){
        System.out.println("This is class A method.");
    }
}

class B extends A{
    void display(){
        System.out.println("This is class B method.");
    }
}

class Prac17 {
    public static void main(String args[]){
        A a1 = new A();
        B b1 = new B();

        a1.display();
        b1.display();
        b1.display();
    }
}