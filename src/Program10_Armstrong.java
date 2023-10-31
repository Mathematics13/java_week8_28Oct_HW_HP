import java.util.Scanner;

/** Program 10
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)    Number of digits in a given number is 3
 * where:
 * (1*1*1)=1                         Cube of each digit
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153                      Sum of cubes of each digit
 */
public class Program10_Armstrong
{
    public static void main(String[] args)
    {
        Scanner s1 = new  Scanner(System.in);                  //Scanner declaration
        System.out.println("Enter any integer  :  ");
        int number = s1.nextInt();
        int originalNumber = number;
        int result = 0;

        int numberOfDigits = String.valueOf(number).length();

        while(number !=0)
        {
            int digit = number % 10;
            result += Math.pow(digit,numberOfDigits);
            number/=10;
        }
        if(result == originalNumber )
        {
            System.out.println(originalNumber + "is an Armstrong number ");
        }
        else
        {
            System.out.println(originalNumber + "is not an Armstrong number ");
        }
        s1.close();
    }
}
