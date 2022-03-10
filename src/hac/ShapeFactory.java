package hac;

/**
 * ShapeFactory is a factory for creating shapes.
 * question: what happen when we want to add a new shape?
 * answer: we need to add a new shape to the factory and change the code.
 * How can we write a factory that won't change when we add a new shape?
 * answer: we can use a Map to store the shape. See the other examples in this repo.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        else if(shapeType.equalsIgnoreCase("TRIANGLE"))
            return new Triangle();

        return null;
    }
}