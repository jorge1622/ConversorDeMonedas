
import java.util.Map;

import static java.lang.Integer.valueOf;
public class Monedas  {




    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;

        }


         private double ars;
         private double cop;

         private double brl;

    public double getBrl() {
        return brl;
    }

    public void setBrl(double brl) {
        this.brl = brl;
    }

    public void setArs(double ars) {
        this.ars = ars;
    }

    public double getArs() {
        return ars;
    }

    public void setCop(double cop) {
        this.cop = cop;
    }

    public double getCop() {
        return cop;
    }

private double pesoIngresado;

    public double getPesoIngresado() {
        return pesoIngresado;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public void setPesoIngresado(double pesoIngresado) {
        this.pesoIngresado = pesoIngresado;
    }


}




















