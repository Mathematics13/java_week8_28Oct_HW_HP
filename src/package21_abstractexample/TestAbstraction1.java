package package21_abstractexample;

/** Create the fourth class name TestAbstraction1 and inside create the main method as below
 * In real scenario, method is called by programmer or user
 */

public class TestAbstraction1                                 //Concrete class not abstract
{
    public static void main(String[] args)                  //Main method
    {
        Shape s = new Circle1();                         //Object creation
                                                        //In real scenario, object is provided through method eg) getShape() method
        s.draw();

        Shape t = new Rectangle();                   //Shape is abstract cannot be instantiated
        t.draw();                                   //For concrete methods , we can create objects not for abstract methods
                                                   //abstraction stops object creation
    }
}
