import java.io.IOException;
import  java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException; // handeion of converting text to date
/*
here we get the inputs from the users keyboard and read then
each method asks for the expected input and handels errors with while loop with
try , catch and finnall error handling
 */

public class ConsoleInputs {
    // read the input
    Scanner scanner = new Scanner(System.in);

    /*
     here we read the text from the user
     the prompt part depends  what menu class calls for an input
     .trim removes spaces
     */
    public String readTextFromUser(String prompt){
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }

    /*
    this methods makes sure that the numbers are inouted and that the
    the range is between a specific part
    it uses while loop for example the when inputting  pet  years
     */
    public int readIntFromUser(String prompt, int min, int max){
        while (true);
        try{
            /*
             store result in value the method reads string so we parseint to read it as string
             range is in the menu class
             */

            int value = Integer.parseInt(readTextFromUser(prompt));
            if(value >= min && value <= max)
                return value;
            System.out.println("Invalid Input please selected a number between " + min + "and" + max );
        }
        catch ( NumberFormatException e) {
            System.out.println("Please return a whole number");
        }
    };


}
