package dip.lab2.student.solution1;

// An useful import if you need it.
import dip.lab2.*;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author Isaac Stefanski
 */
public class Startup {
    public static void main(String[] args) {
        TipCalculator baggageTipCalc = new BaggageServiceTipCalculator(0.15, 4);
        TipCalculator foodTipCalc = new FoodServiceTipCalculator(0.20, 23.97);
        
        TipService tipCalc1 = new TipService(baggageTipCalc);
        TipService tipCalc2 = new TipService(foodTipCalc);
        
        System.out.println("Baggage Service: " + tipCalc1.calcTip());
        System.out.println("Food Service: " + tipCalc2.calcTip());
    }
}