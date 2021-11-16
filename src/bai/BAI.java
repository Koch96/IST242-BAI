package bai;

/** @author sak5680 */
public class BAI {
    private double result = 0;
    
    public BAI(){
        result = 0;
    }
    
    public void calc(double hipCirc, double height){
//      BAI = (hip circumference / (height)^1.5) - 18
        height = height / 100;
        result = (hipCirc / Math.pow(height, 1.5)) - 18;
    }
    
    public double getResult(){
        return result;
    }
    
}
