// Final Class
final class Demo1 {

  // Final variable
  final int a = 10;

  

  //Final Method
  final void show() {
    System.out.print("Value of a: " + a++); //This line will throw error "cannot assign a value to final variable a"
  }
}

class Demo2 extends Demo1 { // This line will throw error "cannot inherit from final Demo1"

  void show() { //This function will throw error "show() in Demo2 cannot override show() in Demo1"
    System.out.print("Value of a: " + a);
  }
}

class Prac10
  public static void main(String args[])
