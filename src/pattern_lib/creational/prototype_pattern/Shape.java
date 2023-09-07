package pattern_lib.creational.prototype_pattern;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {

    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}
