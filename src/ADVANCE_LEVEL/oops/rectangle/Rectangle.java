package ADVANCE_LEVEL.oops.rectangle;

public class Rectangle {
    int height ;
    int width ;
    int area ;

    void findArea()
    {
        area = height * width;
        System.out.println("Area of rectangle = "+area);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.findArea();
    }
}
