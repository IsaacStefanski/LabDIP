package dip.lab2.student.solution1;

/**
 *
 * @author Isaac
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    public double calcTip(){
        return calc.getTip();
    }
    
    public TipCalculator getCalc() {
        return calc;
    }

    public void setCalc(TipCalculator calc) {
        this.calc = calc;
    }    
}