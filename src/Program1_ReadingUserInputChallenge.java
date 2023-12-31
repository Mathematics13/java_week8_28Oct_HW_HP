import java.util.Scanner;

/**Program 1
 * Read 10 numbers from the console entered by the user and print the sum of those numbers
 */
public class Program1_ReadingUserInputChallenge
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                                               //Scanner declaration
        int sum = 0;
        int count = 0;                                                                   //counter variable for valid numbers
        while (count < 10)
        {
            count++;                                                                  //breaking point to stop the while loop
            System.out.println("Enter  number  : " + "#" + count);

            if (s1.hasNextInt())
            {
                System.out.println("Valid number");
                int number = s1.nextInt();
                sum += number;
            }
            else
            {
                System.out.println("Invalid number");
                s1.next();                                                   //Consume the invalid input
                count--;                                                   //Decrement count to re-enter the number
            }
        }
            System.out.println("Sum of the 10 numbers is  :  " + sum);
            s1.close();
    }
}

//1. Read 10 numbers from the console entered by the user and print the sum of those
//        numbers.
//        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//        -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
//        10 numbers.
//        -Use the nextInt() method to get the number and add it to the sum.
//        -Before the user enters each number, print the message Enter number #x: where x represents the
//        count, i.e. 1, 2, 3, 4, etc.
//        -For example, the first message printed to the user would be Enter number #1:, the next Enter number
//        #2:, and so on.
//        Hint:
//        -Use a while loop.
//        -Use a counter variable for counting valid numbers.
//        -Close the scanner after you don't need it anymore.
//         Create a class with the name ReadingUserInputChallenge