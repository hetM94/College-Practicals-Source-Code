class Shape{
    void area(float radius){
        System.out.println("Area of circle: "+(3.14*(radius*radius)));
    }
    void area(float length, float width){
        System.out.println("Area of rectangle: "+(length*width));
    }
}
class Prac11{
    public static void main(String args[])
    {
        Shape s1 = new Shape();
        s1.area(10);
        s1.area(2,5);
    }
}