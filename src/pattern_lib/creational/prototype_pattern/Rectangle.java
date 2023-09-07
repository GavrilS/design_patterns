package pattern_lib.creational.prototype_pattern;


public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }


    public Shape clone() {
        return new Rectangle(this);
    }
}
