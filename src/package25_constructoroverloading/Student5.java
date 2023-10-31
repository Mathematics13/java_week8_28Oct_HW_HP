package package25_constructoroverloading;

//Java Program to overload constructors
public class Student5
{
    int id;                                                 //Global Variables declaration
    String name;                                          //Declaring as global but initialising as local inside the method
    int age;
    Student5(int i,String n)                           //Creating two argument constructor
    {
        id = i;                                      //Global variable initialisation
        name = n;
    }
    Student5(int i,String n,int a)                //Creating three argument constructor
    {
        id = i;
        name = n;
        age = a;
    }
    public void display()                   //non-static method
    {
        System.out.println(id+  "  " +name + "  " +age);
    }
    public static void main(String args[])
    {
        Student5 s1 = new Student5(111,"Karan");
        Student5 s2 = new Student5(222,"Aryan" ,25);
        s1.display();
        s2.display();
    }

}
