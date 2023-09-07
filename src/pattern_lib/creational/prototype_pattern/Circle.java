package pattern_lib.creational.prototype_pattern;

public class Circle extends Shape {
    private int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }


    public Shape clone() {
        return new Circle(this);
    }
}
