class Super {

  int a, b;

  void setData(int a, int b) {
    this.a = a;
    this.b = b;
  }
  void show()
  {
    System.out.println("a = "+a);
    System.out.println("b = "+b);
  }
}

class Sub extends Super {

  void addition() {
    System.out.println("Sum of variables in Super class : " + (a + b));
  }
}

class Prac14 {

  public static void main(String args[]) {
    Sub obj = new Sub();
    obj.setData(5, 4);
    obj.show();
    obj.addition();
  }
}
