// Abstract class to represent arithmetic expressions.
 abstract class ArithmeticExp {

    // Abstract method to be implemented by subclasses for evaluating the expression.
    public abstract int evaluate();
    // Abstract method to be implemented by subclasses for generating a string representation.
    public abstract String toStringRepresentation();
    // This is an example of a method with a default implementation.
    // It can be overridden by subclasses, but it is not mandatory to do so.
    public void someDefaultMethod() {
        // This method can contain default behavior that is common to all subclasses
    }
}
