import java.util.Scanner;
import java.util.Random;
/*Goal: Print out initials using letters, S and H. User input, asking for
 degrees Fahrenheit and convert to Celsius, User input, asking for a 5 character string,
 reverse it and remove first and last characters, generate a random number between 32 and 16,384
 inclusive, print everything out
 */
public class Assignment1 {
  public static void main(String[] args) {
    // print out initials
    System.out.println("SSSSSSSSSS        HH       HH");
    System.out.println("SSS     SS        HH       HH");
    System.out.println("SSS               HH       HH");
    System.out.println("SSSSSSSSSS        HHHHHHHHHHH");
    System.out.println("       SSS        HH       HH");
    System.out.println("SS     SSS        HH       HH");
    System.out.println("SSSSSSSSSS        HH       HH");


    // Fahrenheit to Celcius
    Scanner input = new Scanner(System.in); {
    System.out.println("\nPlease enter a number in degrees Fahernheit: ");
    int Fahernheit = input.nextInt();
    int Celsius = (Fahernheit - 32) * 5/9; // convert fahernheit to celcius


    // takes five character string, reverses it and removes the first and last characters
    System.out.println("Please enter a five character string: ");
    String inputString = input.next();
    String reverseString = new StringBuilder(inputString.substring(1, 4)).reverse().toString();

    //asks for a random number between 32 and 16384 inclusive
    Random rand = new Random();
    }
  }
}
