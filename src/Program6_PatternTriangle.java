// Program 6
/** Write a program in Java to display the pattern like a triangle with a number. For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */
import java.util.Scanner;
public class Program6_PatternTriangle
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                   //Scanner declaration
        System.out.println("Input number of rows  : ");
        int numRows = s1.nextInt();
        s1.close();
        for (int i = 1; i <= numRows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}














