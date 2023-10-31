import java.util.Scanner;

/** Program 2
 * Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered
 */
public class Program2_MinAndMaxInputChallenge
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);                //Scanner declaration
        int min = Integer.MAX_VALUE;                      //Initialize min with a larger value
        int max = Integer.MIN_VALUE; ;                  //Initialize max with a smaller value
        while(true)
        {
            System.out.println("Enter number  : ");
            if (s1.hasNextInt())
            {
                int num = s1.nextInt();
                if (num < min)
                {
                    min = num;
                }
                if (num > max)
                {
                    max = num;
                } else
                {
                    System.out.println("Invalid input.Exiting....");
                    break;                                                      //Exit the loop on invalid input
                }
            }
            s1.nextLine();                                                  //Consume the newline character left by nextInt();
        }
              System.out.println("Minimum number entered :  " + min);
              System.out.println("Maximum number entered :  " + max);
          s1.close();
        }
    }

//    2. -Read the numbers from the console entered by the user and print the minimum
//            and maximum number the user has entered.
//            -Before the user enters the number, print the message Enter number:
//            -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//    Hint:
//Use an endless while loop
//Create a class with the name MinAndMaxInputChallenge
