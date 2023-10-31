package package17_carpet_cost_calculator;

//Program 17 Class 1

public class Floor
{
     double width;                                                  //instance variables
    double length;
    public Floor(double width, double length)                         //Constructors with two parameters
    {
        if (width < 0)
        {
            this.width = 0;
        }
        else
        {
            this.width = width;
        }
        if (length < 0)
        {
            this.length = 0;
        }
        else
        {
            this.length = length;
        }
    }
    public double getArea ()                                              //instance methods  ,method to calculate the area
    {
        double area = width * length;
        return area;
    }
}


//        public static void main (String[]args)                  No need to write the main method for this class
//        {
//            Floor f1 = new Floor(12,10);
//            System.out.println("Area of floor1: " +f1.getArea());
//
//            Floor f2 = new Floor(-5,15);                             //since width<0 , then area = 0, no negative area
//            System.out.println("Area of floor2: " +f2.getArea());
//        }


/** Carpet Cost Calculator (Create package name
 *carpet_cost_calculator’ and create all below classes in this package)
 * The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.
 * 1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 *Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */

