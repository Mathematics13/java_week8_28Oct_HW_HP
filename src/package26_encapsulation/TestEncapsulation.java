package package26_encapsulation;

public class TestEncapsulation
{
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();                                 //Object created for the class
        obj.setName("Hari");
        obj.setRollNo(19);                                                //Setting values of the variables
        obj.setAge(23);                                                 //No output for just setting the values

        System.out.println("Prime's name :    "  +obj.getName());    //Displaying values of the variables
        System.out.println("Prime's age :     "  +obj.getAge());
        System.out.println("Prime's rollNo :  "  +obj.getRollNo());
    }
}

//Direct access of private variables not possible due to encapsulation
//System.out.println("Prime's rollNo :  "  +obj.getRollNo());

