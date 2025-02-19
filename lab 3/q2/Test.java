package lab3.q2;

public class Test implements Testable {
    public void display() {
        System.out.println("Displaying Test object!");
    }
    // observations
    /*
     The abstract class AbsTest implements the Testable interface but does not
     provide an implementation for display(). A subclass (like ConcreteTest)
     must provide the implementation for the method. The abstract class serves
     as a blueprint, and only concrete subclasses can instantiate objects and use
     the display() method.
     */
}
