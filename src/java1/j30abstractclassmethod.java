package java1;

abstract class shape{
    abstract void area();
    abstract void perimeter();
    // abstract class - no objects
}
class circle extends shape{
    @Override
    void area() {
        System.out.println("area of circle");
    }

    @Override
    void perimeter() {
        System.out.println("per of circle");
    }
}
class rectangle extends shape{

    @Override
    void area() {
        System.out.println("AREA OF RECTANGLE");
    }

    @Override
    void perimeter() {
        System.out.println("per of rectangle");
    }
}
public class j30abstractclassmethod {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.area();
        c1.perimeter();
    }
}

