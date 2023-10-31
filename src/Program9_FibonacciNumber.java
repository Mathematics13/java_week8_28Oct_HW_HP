import java.util.Scanner;

/** Program 9
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9_FibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);               //Scanner declaration
        System.out.print("Enter the number of terms in the Fibonacci sequence   :  ");
        int n = s1.nextInt();
        int firstTerm = 1, secondTerm = 1;
        System.out.print("Fibonacci Sequence : " + firstTerm + " " + secondTerm );
        for(int i = 3; i<=n; i++)
        {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + "  ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        s1.close();
    }
}
