package package23_methodoverriding;

/** Creating a child class
 * Bike2 extends Vehicle
 */

public class Bike2 extends Vehicle
{
    public static void main(String[] args)
        {
            Bike2 obj = new Bike2();                                 //Always create object for the child class to access parent class properties and child
            obj.run();                                              //class properties as well
        }                                                          //Parent class methods been overridden in the child class
    @Override
    public void run()                                            //Developing the method in the parent class with same method name and signature
    {                                                           //as in child class but with different implementation
                                                               //super.run(); super keyword used to print parent class implementation along with child class
        System.out.println("Bike  is running safely");        //Method Overriding
                                                             //super keyword is always present in the non-stattic method of the child class not in psvm
    }
}
