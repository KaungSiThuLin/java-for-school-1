interface HasGetAreaMethod {
    double getArea();
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape implements HasGetAreaMethod {
    void draw() {
        System.out.println("Rectangle");
    }

    public double getArea() {
        System.out.println("RectangleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Circle extends Shape implements HasGetAreaMethod {
    void draw() {
        System.out.println("Circle");
    }

    public double getArea() {
        System.out.println("CircleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Polyline extends Shape {
    void draw() {
        System.out.println("Polyline");
    }
}

class Polygon extends Polyline implements HasGetAreaMethod {
    void draw() {
        System.out.println("Polygon");
    }

    public double getArea() {
        System.out.println("PolygonクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

public class AreaExample {
    public static void main(String[] args) {
        HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3];
        closedShapes[0] = new Polygon();
        closedShapes[1] = new Rectangle();
        closedShapes[2] = new Circle();

        for(int i = 0; i < 3; i++) {
            closedShapes[i].getArea();
        }

    }
}
