/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textvalidator;

import java.util.Scanner;

/**
 *
 * @author denilsonl.
 */
public class TextValidator {

    /**
     * promps user to enter some text. if not text will keep repeating promp
     *
     * @param promp the question or promp to the user
     * @return text entered by user as a String
     */
    public String askUserForText(String promp) {

        Scanner myKB = new Scanner(System.in);

        String userInput;

        do {
            System.out.println(promp);// Display the prompt

            System.out.println("You must enteronly text with more than one character.");

            userInput = myKB.nextLine();// Read user input

            //Validating that the input just include string 
            //also validate that the input contaid more than 1 caracter
        } while (!userInput.matches("[a-zA-Z.!?, '\"]+" )|| userInput.length() <= 1);

        return userInput;// Return the validated input
    }

    ;
    
    
    
  /**
 * Rearranges the name by moving the first character to the end
 * and the last character to the front.
 * @param name The name to be rearranged.
 * @return The rearranged name.
 */ 
public String ChangeFirstCaracter(String name) {
   
    // Extract first, last, and middle parts of the string
    
    char firstChar = name.charAt(0); // First character
    
    char lastChar = name.charAt(name.length() - 1); // Last character
    
    String middlePart = name.substring(1, name.length() - 1); // Middle section

    // Rearrange: Last + Middle + First
    return lastChar + middlePart + firstChar;
}

    /**
     * Converts the input string to uppercase.
     * @param input The text to be transformed.
     * @return The uppercase version of the input text.
     */
    public String changeName(String input) {

        return input.toUpperCase();// Convert the input to uppercase
    };
    
    /**
     * Returns the length of the input string.
     * @param input The name to analyze.
     * @return A string stating the number of characters.
     */
    public String nameLength(String input){
   
        return ("\nYour name contin "+ input.length() + " letter ");
        
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
