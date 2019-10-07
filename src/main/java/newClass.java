import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class newClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//  Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//
//  Tells whether or not what the user entered is a number
//  Flips the case of the string
//  Reverses the string
//  Example Console Output

        System.out.println("Enter Something: ");

        String str = input.nextLine();

        System.out.println("You entered " + str);

        boolean numberCheck = StringUtils.isNumeric(str);

        if (numberCheck){
            System.out.println(str + " is a number");
        }else{

            System.out.println(str + " is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(str));

        System.out.println("Reversed: " + StringUtils.reverse(str));

    }
}
