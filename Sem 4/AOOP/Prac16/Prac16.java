class FinalCalc {
    // String thisClassCall;
    void show(String thisClassCall){
        System.out.println("This is " + thisClassCall + " Call.");
    }
}

class RectangleValues extends FinalCalc{
    String thisClassCall = "RectangleValues";
}

class RectArea extends FinalCalc{
    String thisClassCall = "RectArea";
}



class Prac16 {
    public static void main(String args[]){
        RectangleValues r1 = new RectangleValues();
        r1.show(r1.thisClassCall);

        RectArea a1 = new RectArea();
        a1.show(a1.thisClassCall);
    }
}