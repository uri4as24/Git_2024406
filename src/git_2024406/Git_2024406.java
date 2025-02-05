/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024406;
import textvalidator.TextValidator;


/**
 *
 * @author Denilson 2024406.
 */
public class Git_2024406 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      TextValidator validator = new TextValidator();

        String name;

        //Sending to validate the input and make sure the user just enter STRING 
        name = validator.askUserForText("Please enter your name\n");
        
        
        //Convert the name to uppercase using the changeName method
        String nameUpperCase = validator.changeName(name);
        
        //Rearrange the name by moving the first character to the end
        // and the last character to the front
        String rearrangedName = validator.ChangeFirstCaracter(nameUpperCase);

        System.out.println("\nThank you! Your name in uppercase is:  " + nameUpperCase);

        System.out.println("\nYour rearranged name is: " + rearrangedName);

        System.out.println(validator.nameLength(name));    
    }
    
    
}
