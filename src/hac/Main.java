package hac;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        try {
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();

            Shape shape2 = shapeFactory.getShape("RECTANGLE");
            shape2.draw();

            Shape shape3 = shapeFactory.getShape("TRIANGLE");
            shape3.draw();

        } catch (Exception e) {
            System.out.println("Some error occured: " + e.getMessage());
        }

    }
}
