
//Program 11

import java.util.Scanner;

public class Program11_EvenDigitSum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = s.nextInt();
        int evenDigitSum = getEvenDigitSum(num);

        if (evenDigitSum == -1)
        {
            System.out.println("Invalid Input:  Enter a positive number : ");
        }
        else
        {
            System.out.println("Sum of even digits: "+ evenDigitSum);
        }
        s.close();
    }
                                                                                         //even digit sum method
    public static int getEvenDigitSum(int num)
    {
        if (num < 0)
        {
            return -1;
        }
        int sum = 0;
        while (num >0)
        {
            int digit = num % 10;
            if(digit % 2 == 0)
            {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }
}

/** Even Digit Sum
 Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.
 EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 NOTE: The method getEvenDigitSum should be defined as public static
 */








