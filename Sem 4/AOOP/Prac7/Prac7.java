class Prac7{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();
        rect.getData(2,2);
        System.out.println("Area of the rectangle: "+ rect.area());
    }
}
class Rectangle{
    float height,width;

    void getData(float a, float b)
    {
        height = a;
        width = b;
    }

    float area()
    {
        return height * width;
    }

}