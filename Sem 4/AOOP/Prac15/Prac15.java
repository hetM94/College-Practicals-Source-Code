class RectangleValues {
    int length = 20, breadth = 10;
}

class RectArea extends RectangleValues{
    int area = length*breadth;
}

class FinalCalc extends RectArea{
    void display(){
        System.out.println("Rectangle Area: " + area);
    }
}

class Prac15 {
    public static void main(String args[]){
        FinalCalc f1 = new FinalCalc();
        f1.display();
    }
}