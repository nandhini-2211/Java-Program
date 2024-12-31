interface Shape {
    void getArea(int... values);  
}

class Rectangle implements Shape {
    public void getArea(int... values) {
        int length = values[0];
        int breadth = values[1];
        int area = length * breadth;
        System.out.println("Rectangle area: " + area);
    }
}

class Triangle implements Shape {
    public void getArea(int... values) {
        int base = values[0];
        int height = values[1];
        double area = 0.5 * base * height;
        System.out.println("Triangle area: " + area);
    }
}

class Circle implements Shape {
    public void getArea(int... values) {
        int radius = values[0];
        double area = 3.14 * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(5, 3);  
        
        Triangle t = new Triangle();
        t.getArea(4, 3);  
        
        Circle c = new Circle();
        c.getArea(5);  
    }
}
