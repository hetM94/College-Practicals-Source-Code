final class RestrictedInheritance {
    final int a = 5;
    final void display(){
        System.out.println("This is the final class method.");
    }
}

class ThisThrowsAnError extends RestrictedInheritance{
    void display(){
        System.out.println("This is the subclass method.");
    }
}

class Prac21 {
    public static void main(String args[]){
        RestrictedInheritance r1 = new RestrictedInheritance();
        r1.display();

        ThisThrowsAnError t1 = new ThisThrowsAnError();
        t1.display();
        t1.a = 10;
    }
}