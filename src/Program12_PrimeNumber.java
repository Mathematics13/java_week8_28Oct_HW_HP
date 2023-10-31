import java.util.Scanner;

/** Program 12
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 * In other words, prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */

public class Program12_PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner (System.in);                                             //Scanner declaration
        System.out.println("Enter any integer  :  ");
        int number = s1.nextInt();
        if(isPrime(number))
        {
            System.out.println("The given number is a prime number");
        }
        else
        {
            System.out.println("The given number is not a prime number");
        }
        s1.close();
    }
    public static boolean isPrime(int number)
    {
        if(number <=1 )
        {
           return false;                                                            //Numbers less than or equal to 1 are not prime
        }
        for(int i=2; i<=Math.sqrt(number); i++)
        {
           if(number%i==0)
           {
               return false;                                                    //If its divisible by any number other than 1 and itself, it's not prime.
           }
        }
        return true;                                                          // If the loop completes without finding a divisor, it's a prime number
    }
}

