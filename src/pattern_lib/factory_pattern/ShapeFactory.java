package pattern_lib.factory_pattern;

public class ShapeFactory {
    private static final String RECTANGLE_VALUE = "RECTANGLE";
    private static final String SQUARE_VALUE = "SQUARE";
    private static final String CIRLE_VALUE = "CIRCLE";


    // Use the getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType == RECTANGLE_VALUE) {
            return new Rectangle();
        } else if (shapeType == SQUARE_VALUE) {
            return new Square();
        } else if (shapeType == CIRLE_VALUE) {
            return new Circle();
        }
        return null;
    }
}
