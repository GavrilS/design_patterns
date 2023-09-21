package pattern_lib.creational.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        List<Shape> copies = new ArrayList<Shape>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, copies);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> copies) {
        for (Shape shape : shapes) {
            copies.add(shape.clone());
        }

        for (int i=0; i < shapes.size(); i++) {
            if (shapes.get(i) != copies.get(i)) {
                System.out.println(i + ": Shapes are different objects!!!");
                if (shapes.get(i).equals(copies.get(i))) {
                    System.out.println(i + ": And they are identical!!!");
                } else {
                    System.out.println(i + ": But they are not identical..........");
                }
            } else {
                System.out.println(i + ": Shape objects are the same object................");
            }
        }
    }
}
