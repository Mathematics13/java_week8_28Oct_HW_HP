
//Program 13

public class Program13_SharedDigit
{
    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12,23));                     //Should return true
        System.out.println(hasSharedDigit(9,99));                     //Should return false
        System.out.println(hasSharedDigit(15,55));                   //Should return true
    }
    public static boolean hasSharedDigit(int a,int b)                     //a and b are two numbers
    {
        if((a<10 || a>99 ) || (b<10 && b>99))                                //Check if numbers are within the valid rabge
        {
           return false;
        }

        int digit1, digit2;
        digit1 = a%10;
        digit2 = b%10;

        a/=10;
        b/=10;
        return(digit1==b || digit1==b) || (digit1==a || digit1==a);
    }
}

/**  Shared Digit
 Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
 The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 NOTE: The method hasSharedDigit should be defined as public static

 */
