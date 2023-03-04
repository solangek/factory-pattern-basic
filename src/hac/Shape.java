package hac;

/**
 * a shape interface
 */
public interface Shape {
    String CIRCLE = "CIRCLE"; // in an interface, this declaration is equivalent to public static final (constants)
    String RECTANGLE = "RECTANGLE"; // why is it bad to put const in an interface?
    String TRIANGLE = "TRIANGLE";

    void draw(); // the method is public by default
}
