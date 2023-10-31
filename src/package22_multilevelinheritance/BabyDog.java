package package22_multilevelinheritance;

/** Third Class
 * BabyDog extends Dog
 */

public class BabyDog extends Dog                          //Only the childmost class has main method
{
    public void weep()
    {
        System.out.println("weeping...");
    }
}
