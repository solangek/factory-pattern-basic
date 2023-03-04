package hac;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        try {
            Shape shape1 = shapeFactory.getShape(Shape.CIRCLE);
            shape1.draw();

            Shape shape2 = shapeFactory.getShape(Shape.RECTANGLE);
            shape2.draw();

            Shape shape3 = shapeFactory.getShape(Shape.TRIANGLE);
            shape3.draw();

            Shape shape4 = shapeFactory.getShape("POLYGON"); // will throw an exception
            shape4.draw();

        } catch (Exception e) {
            System.out.println("Some error occured: " + e.getMessage());
        }

    }
}
