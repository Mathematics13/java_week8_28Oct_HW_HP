package package20_poolarea;

/** Class 3 Main
 */
public class Main
{
    public static void main(String[] args)
    {
    Rectangle r1= new Rectangle (5,10);
    System.out.println("Rectangle width  = " +r1.getWidth());
    System.out.println("Rectangle length =  "+r1.getLength());
    System.out.println("Rectangle Area =  "+r1.getArea());

    Cuboid c1= new Cuboid(5,10,5);
        System.out.println("Cuboid width = " +c1.getWidth());
        System.out.println("Cuboid length = " +c1.getLength());
        System.out.println("Rectangle Area = " +c1.getArea());
        System.out.println("Cuboid height  = " +c1.getHeight());
        System.out.println("Cuboid Volume  = " +c1.getVolume());
    }
}
