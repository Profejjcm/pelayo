package es.calcularpi;
import java.math.BigDecimal;
import java.math.MathContext;


public class CalcularPI extends ClasePadre {

     public static void main(String[] args) {
        MathContext mc = new MathContext(NUM_DIG);         
        compute(mc);
    }

    public static void compute(MathContext mc) {
        //meter en el método compute
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(10);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            BigDecimal piK = piFunction(k, mc);
            //meter en el método piFunction                
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }
    public static final int NUM_DIG = 10;

     
}
