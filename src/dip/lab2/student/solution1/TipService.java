package dip.lab2.student.solution1;

/**
 *
 * @author Isaac
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        setCalc(calc);
    }
    
    public final double calcTip(){
        return calc.getTip();
    }
    
    public final TipCalculator getCalc() {
        return calc;
    }

    public final void setCalc(TipCalculator calc) {
        if(calc != null){
            this.calc = calc;
        } else {
            throw new IllegalArgumentException("Calculator cannot be null");
        }
    }    
}