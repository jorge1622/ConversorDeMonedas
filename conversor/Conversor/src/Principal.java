import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        int elecion;
        Monedas monedas = new Monedas();
        monedas.obtenerDatosDeAPI();

        double cop = monedas.getCop();
        double usd = monedas.getDolar();
       double ars = monedas.getArs();
       double brl = monedas.getBrl();
       System.out.println("PRECIOA AASA" + brl);
       System.out.println("PRECIOA AASA" + brl);
       System.out.println("PRECIOA AASA" + brl);

            Scanner lectura = new Scanner(System.in);
            System.out.println("////////////**********************////////");
            System.out.println("Sea vienvenido al conversor de monedas");
            System.out.println("*******************************************");

            do {
                System.out.println("1) Dolar ==>> A pero Argentino ");
                System.out.println("2) Peso Argentino  ==>> A Dolar ");
                elecion = lectura.nextInt();



                switch (elecion){
                    case 1:
                        System.out.println("Ingrese el valore que deseas Convertir ");
                       double  convertir  = lectura.nextDouble();
                       usd *= ars;
                        System.out.println("El valor de " + convertir + "$  corresponde en pesos argentinos a " + usd +" ARS");
                        break;
                    case 2:
                        System.out.println("Ingrese el valore que deseas Convertir ");
                        convertir = lectura.nextDouble();
                        double pesoArsIngresado = convertir;
                         convertir /= ars;
                        System.out.println("El valor de " + pesoArsIngresado + " ARS  corresponde en Dolares  a " + convertir +" $");







                        break;







}



    }while (elecion !=7);
}


    }








