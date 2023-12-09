// Abstract class to represent arithmetic expressions.
abstract class ArithmeticExp {
   // Abstract method to be implemented by subclasses
   public abstract int evaluate();
   // Abstract method to be implemented by subclasses
   public abstract String toStringRepresentation();
   public void someDefaultMethod() {
      // This method can contain default behavior that is common to all subclasses
   }
}
// Concrete class representing a number
class ModifiedNumberExp extends ArithmeticExp {
   // Private field to store the value of the number
   private int modifiedValue;
   // Constructor to initialize the value
   public ModifiedNumberExp(int modifiedValue) {
      this.modifiedValue = modifiedValue;
   }
   // Implementation of the evaluate method
   @Override
   public int evaluate() {
      return modifiedValue;
   }
   // Implementation of the toStringRepresentation method
   @Override
   public String toStringRepresentation() {
      return String.valueOf(modifiedValue);
   }
}
