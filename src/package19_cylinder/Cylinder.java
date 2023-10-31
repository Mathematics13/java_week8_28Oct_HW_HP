package package19_cylinder;

//Class 2 Cylinder
public class Cylinder extends Circle
{
    double height;                                                     //instance variable GV declaration

    Cylinder(double radius,double height)
    {
        super(radius);                                          //Calling parent class constructor from child class constructor with super calling statement
        if(height<0)
        {
            this.height=0;
        }
        else
        {
            this.height=height;                               //initialize a height field by 'this' keyword
        }
    }
public  double getHeight()                                //instance methods
{
    return height;
}
public double getVolume()                            //Volume of the cylinder is pi*r*r*h
{
    return getArea()* height;
}
}

/** Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
 The class needs to have one constructor with two parameters radius and height both of type double. It needs to call the parent constructor and initialize a height field.

 *In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height field.
 * ● Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume, multiply the area with height.
 */
