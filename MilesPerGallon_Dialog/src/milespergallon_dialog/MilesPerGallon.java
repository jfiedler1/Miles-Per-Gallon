package milespergallon_dialog;
import javax.swing.JOptionPane;

//@author Joshua Fiedler

public class MilesPerGallon
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     String inputString;       // Reads input
     double miles;            // Number of miles driven
     float gallons;          // Number of gallons of gas used
     double mpg;            // Miles per gallon
     
     // Get the miles driven
     inputString =
        JOptionPane.showInputDialog("How many miles " +
                                    "did you drive? ");
     
     // Convert the input to an int
     miles = Integer.parseInt(inputString);
     
     // Get the gallons of gas used
     inputString = 
        JOptionPane.showInputDialog("How many gallons of gas " +
                                    "did you use? ");
     
     // Convert the input to an int
     gallons = Integer.parseInt(inputString);
     
     // Calculate the miles per gallon
     mpg = miles / gallons;
     
     // Show the answer
     JOptionPane.showMessageDialog(null, "The miles per gallon is " + 
                                   mpg);
     
     // End the program
     System.exit(0);
    }
    
}
