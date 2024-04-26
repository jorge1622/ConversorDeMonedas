import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        try {
            Monedas monedas = new Monedas();
            monedas.obtenerDatosDeAPI();
            double cop = monedas.getCop();
            double usd = monedas.getDolar();
            int eelecion;
            Scanner lectura = new Scanner(System.in);


            System.out.println("Valor de USD a COP: " + cop);
            System.out.println("Valor de COP a USD: " + usd);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }



}

    }








