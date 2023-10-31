package package17_carpet_cost_calculator;

//Program 17 Class 3
public class Calculator
{
    Floor floor;                                            //two fields instance variables GV
   Carpet carpet;

    Calculator(Floor floor,Carpet carpet)              //Constructor with two parameters
    {
        this.floor=floor;                           //To initialise the fields this.GV =L.V
        this.carpet=carpet;
    }
    public double getTotalCost()               //Calculate the total cost by multiplying the area of the floor by the cost per square meter of the carpet
    {
        double total_cost= this.floor. getArea () * this.carpet.getCost();
        return total_cost;
    }
}

/** Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
 The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
 Write the following methods (instance methods):
 ● Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet
 */

