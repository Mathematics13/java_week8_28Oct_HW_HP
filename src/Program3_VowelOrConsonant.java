import java.util.Scanner;

/** program 3
 * Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input.
 * If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Program3_VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);                                            //Scanner declaration
        System.out.println("Input an alphabet   :  ");
        String input = s.nextLine();
        if (input.length() == 1 && Character.isLetter(input.charAt(0)))              //Check if the input is a single character
        {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')    //Check if the character is a vowerl or a consonant
            {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a single character");
        }
        s.close();
    }
}

















