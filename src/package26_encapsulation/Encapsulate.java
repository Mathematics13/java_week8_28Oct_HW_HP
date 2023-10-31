package package26_encapsulation;

/** Encapsulations example
 * Create package name 'encapsulation26'
 * Create all below classes in this package
 */
public class Encapsulate
{
    private String name;                              //private variables declared, these can only be accessed by public methods of class
    private int rollNo;
    private int age;
    public void setName(String name)            //set method for name to access private variable name
    {
       this.name = name;
    }
    public String getName( )                //get method for name to return the value in order to access private variable
    {
        return name;
    }
  public void setRollNo(int rollNo)   //set method for rollNo to access private variable name
  {
      this.rollNo=rollNo;
  }
  public int getRollNo()         //get method for rollNo to return the value in order to access private variable
  {
      return rollNo;
  }
  public void setAge(int age)    //set method for age to access private variable name
  {
      this.age=age;
  }
  public int getAge()           //get method for age to return the value in order to access private variable
  {
      return age;
  }
}
