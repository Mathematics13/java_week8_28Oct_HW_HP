package package17_carpet_cost_calculator;

//Program 17 Class 2
public class Carpet
{
    double cost;                                //instance variable

    public Carpet(double cost)                      //Constructor with one parameter cost of type double
    {
        //To initialize the field

        if (cost < 0)
        {
            this.cost = 0;
        }
        else
        {
            this.cost = cost;
        }
    }
    public double getCost()
    {
        return cost;
    }
    }

/** Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getCost without any parameters, it needs to return the value of cost field
 */














