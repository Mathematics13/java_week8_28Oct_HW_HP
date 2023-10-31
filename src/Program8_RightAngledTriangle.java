
// Program 8

import java.util.Scanner;

/** Display right angled triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Program8_RightAngledTriangle
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                            //Scanner declaration
        System.out.println("Enter the number of rows  : ");
        int numRows=s1.nextInt();
        s1.close();
        for(int i=1;i<=numRows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
