
// Program 14

import java.util.Scanner;

/** Write a program in Java to display the pattern like a diamond.
 While loop
 *
 ***
 *****
 *******
 *********
 ***********
 *************
 ***********
 *********
 *******
 *****
 ***
 *
 */
public class Program14_DiamondPattern
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                                               //Scanner declaration
        System.out.println("Enter the number of  lines in the middle of the diamond  :  ");
        int n = s1.nextInt();
        if(n>0 && n%2 ==1)                                                            //Ensure n is a positive odd number
        {
            int i =1;
        while (i<=n)                                                           //Print the upper part of the diamond
        {
            int j = 1;
            while (j <= i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i += 2;
        }
        i=n-2;
        while(i>=1)                                                 //Print the lower part of the diamond
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i-=2;
        }
        }
        else
        {
            System.out.println("Invalid input : Enter a positive odd number  : ");
        }
        s1.close();
    }
}
