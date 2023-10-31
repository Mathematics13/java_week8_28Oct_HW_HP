package package22_multilevelinheritance;

/** Fourth Class
 * To test the inheritance
 */

public class TestInheritance
{
    public static void main(String[] args)
    {
        BabyDog d = new BabyDog();                    //If we create object for childmost class then we can access parent class methods and grandparent class methods
        d.weep();
        d.bark();
        d.eat();
    }
}
