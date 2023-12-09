// Abstract class to represent arithmetic expressions.
abstract class ArithmeticExpression {
   // Abstract method to be implemented by subclasses
   public abstract int evaluate();
   // Abstract method to be implemented by subclasses
   public abstract String toStringRepresentation();
   public void someDefaultMethod() {
      // This method can contain default behavior that is common to all subclasses
   }
}
// Concrete class representing a number
class NumberExp extends ArithmeticExpression {
   // Private field to store the value of the number
   private int Value;
   // Constructor to initialize the value
   public NumberExp(int modifiedValue) {
      this.Value = modifiedValue;
   }
   // Implementation of the evaluate method
   @Override
   public int evaluate() {
      return Value;
   }
   // Implementation of the toStringRepresentation method
   @Override
   public String toStringRepresentation() {
      return String.valueOf(Value);
   }
}
// Abstract class representing binary operations
abstract class BinaryExpression extends ArithmeticExpression {
   protected ArithmeticExpression left;
   protected ArithmeticExpression right;
   public BinaryExpression(ArithmeticExpression left, ArithmeticExpression right) {
      this.left = left;
      this.right = right;
   }
}
// Class representing addition
class SumExp extends BinaryExpression {
   public SumExp(ArithmeticExpression left, ArithmeticExpression right) {
      super(left, right);
   }
   @Override
   public int evaluate() {
      return left.evaluate() + right.evaluate();
   }
   @Override
   public String toStringRepresentation() {
      return left.toStringRepresentation() + " + " + right.toStringRepresentation();
   }
}
// Class representing multiplication
class ProductExp extends BinaryExpression {
   public ProductExp(ArithmeticExpression left, ArithmeticExpression right) {
      super(left, right);
   }
   @Override
   public int evaluate() {
      return left.evaluate() * right.evaluate();
   }
   @Override
   public String toStringRepresentation() {
      return left.toStringRepresentation() + " * " + right.toStringRepresentation();
   }
}
// Class representing modulo
class ModuloExp extends BinaryExpression {
   public ModuloExp(ArithmeticExpression left, ArithmeticExpression right) {
      super(left, right);
   }
   @Override
   public int evaluate() {
      return left.evaluate() % right.evaluate();
   }
   @Override
   public String toStringRepresentation() {
      return left.toStringRepresentation() + " % " + right.toStringRepresentation();
   }
}

