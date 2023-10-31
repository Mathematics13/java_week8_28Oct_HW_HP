/** Program 15
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class Program15_LeftAngledTriangle
{
    public static void main(String[] args)
    {
        int num=5;
       for (int i=1;i<=num;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
