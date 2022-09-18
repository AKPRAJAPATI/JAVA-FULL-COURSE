package ADVANCE_LEVEL.oops.rectangle;

public class Rectangle2 {
    int height;
    int width;
    int area;

    void getParameter() {
        height = 10;
        width = 23;
    }

    void findArea() {
        area = height * width;
        System.out.println("Area of rectangle = " + area);
    }

    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2();
        rectangle.getParameter();
        rectangle.findArea();
    }
}
