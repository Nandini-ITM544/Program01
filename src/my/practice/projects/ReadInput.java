package my.practice.projects;

import java.util.Scanner;

/**
 * Created by Nandini on 4/30/2019.
 */
public class ReadInput {

    private static void main(String[] args) {

            // Creates a reader instance which takes
            // input from standard input - keyboard
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a number: ");

            // nextInt() reads the next integer from the keyboard
            int number = reader.nextInt();

            // println() prints the following line to the output screen
            System.out.println("You entered: " + number);
        }
    }

