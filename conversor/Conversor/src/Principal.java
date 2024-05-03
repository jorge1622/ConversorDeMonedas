import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        DecimalFormat numeroDecimal = new DecimalFormat("#.##");

        try(Scanner lectura = new Scanner(System.in);) {

            ObtenerDatosApi monedas = new ObtenerDatosApi();
            monedas.obtenerDatosDeAPI();
            System.out.println("////////////**********************////////");
            System.out.println("Sea vienvenido al conversor de monedas");
            System.out.println("*******************************************");
            int elecion;
            do {
                mostrarMenu();
                elecion = lectura.nextInt();
                switch (elecion){
                    case 1:
                        conversorDeDolarAPesoArgemtino(monedas, lectura , numeroDecimal);
                        break;
                    case 2:
                        conversorDePesoArgentinoADolar(monedas, lectura , numeroDecimal);
                            break;
                        case 3:
                            conversorDeDolarARealBrasileño(monedas, lectura, numeroDecimal);
                            break;
                        case 4:
                            conversordeRealBrasileñoADolar(monedas, lectura, numeroDecimal);
                           break;
                         case 5:
                             conversorDolarAPesoCop(monedas, lectura , numeroDecimal);
                            break;
                        case 6:
                             converdPesoCopADolar(monedas, lectura , numeroDecimal);
                        break;
                    case 7:
                        conversorDeDolarAPesoChileno(monedas, lectura , numeroDecimal);
                      break;
                    case 8:
                        conversorDePesoChilenoADolar(monedas , lectura , numeroDecimal);
                        break;
                    case 9:
                        conversorDeDolarAPesoMexicano(monedas, lectura , numeroDecimal);
                        break;
                    case 10:
                        conversorDePesoMexicanoADolar(monedas, lectura , numeroDecimal);
                        break;
                        case 11:
                        System.out.println("Gracias por utilizar el conversor de monedas");
                        break;
                    default:
                        System.out.println("Ingrese una opcion Valida");
                        break;

                }
            }while (elecion !=11);
  
            lectura.close();
    }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        };
}
private static  void mostrarMenu(){

    System.out.println("1) Dolar ==>> A pero Argentino ");
    System.out.println("2) Peso Argentino  ==>> A Dolar ");
    System.out.println("3) Dolar  ==>> A Real Brasileño ");
    System.out.println("4) Real Brasileñor  ==>> A Dolar ");
    System.out.println("5) Dolar  ==>> A Peso Colombiano ");
    System.out.println("6) Peso Colombiano  ==>> A Dolar ");
    System.out.println("7) Dolar ==>> A Peso Chileno ");
    System.out.println("8) Peso Chileno ==>> A Dolar ");
    System.out.println("9) Dolar ==>> A Peso Mexicano");
    System.out.println("10) Peso Mexicano ==>> A Dolar ");
    System.out.println("11) Salir ");
}

private static void conversorDeDolarAPesoArgemtino(Monedas monedas, Scanner lectura , DecimalFormat numeroDecimal){
    double ars = monedas.getArs();
    System.out.println("Ingrese el valore que deseas Convertir de Dolar A Peso Argentino");
    double valorEnDolares = lectura.nextDouble();
    double valorEnPesoArgentino = valorEnDolares * ars;
    String valorFormateado = numeroDecimal.format(valorEnPesoArgentino);
    if (valorEnDolares >= 1){
        System.out.println("El valor de " + valorEnDolares + "$ Dolares  Equivale A " + valorFormateado +" Pesos Argentinos");

    }else {
        System.out.println("Ingresa un Valor Valido");
    }

}

private static void conversorDePesoArgentinoADolar(Monedas monedas, Scanner lectura , DecimalFormat numeroDecimal){
        double ars = monedas.getArs();
    System.out.println("Ingrese el valore que deseas desea Convertir de peso Argentino a Dolares ");
    double valorEnPesoArgentino = lectura.nextDouble();
    double valorEnDolares = valorEnPesoArgentino / ars;
    String valorFormateado = numeroDecimal.format(valorEnDolares);
    if (valorEnPesoArgentino >= 1){
        System.out.println("El valor de   " + valorEnPesoArgentino + "  Pesos Argentinos Equivale  A " + valorFormateado +"$ Dolares");

    }else {
        System.out.println("Ingresa un Valor Valido");
    }
}
private  static void conversorDeDolarARealBrasileño(Monedas monedas, Scanner lectura , DecimalFormat numeroDecimal){
        double brl = monedas.getBrl();
    System.out.println("Ingrese el valore que deseas Convertir de Dolares a Real Brasieño ");
    double valorDolar = lectura.nextDouble();
    double valorEnRealBrasileño = valorDolar * brl;
    String valorFormateado = numeroDecimal.format(valorEnRealBrasileño);
    if (valorDolar >= 1){
        System.out.println("El valor de " + valorDolar + "$ Dolares  Equivale A "   + valorFormateado +  " Reales Brasileño ");
    }else {
        System.out.println("Ingresa un Valor Valido");
    }
}

private static void conversordeRealBrasileñoADolar(Monedas monedas, Scanner lectura, DecimalFormat numeroDecimal){
        double brl = monedas.getBrl();
    System.out.println("Ingresa el valor que desea converitir de Real Brasileño  a Dolar");
        double valorEnRealBrasileño = lectura.nextDouble();
        double valorDolar = valorEnRealBrasileño /brl;
        String valorFormateado = numeroDecimal.format(valorDolar);
        if (valorEnRealBrasileño >= 1){
            System.out.println("El valor de  " + valorEnRealBrasileño + " Reales Brasileños  Equivale A  " +  valorFormateado + "$ Dolares");
        }else {
            System.out.println("Ingresa un Valor Valido");
        }
}
private static void conversorDolarAPesoCop(Monedas monedas,Scanner lectura , DecimalFormat numeroDecimal){
    double cop = monedas.getCop();
    System.out.println("Ingrese el valor que desea convertit de  Dolar a Peso Colombiano");
    double valorenDolar = lectura.nextDouble();
    double valorenPesoCop = valorenDolar * cop;
    String valorFormateado=numeroDecimal.format(valorenPesoCop);

if (valorenDolar >= 1){
    System.out.println("El valor de " + valorenDolar+ " Dolares  Equivale a " + valorFormateado+ " Pesos Colombianos");
}else{
    System.out.println("Ingrese un Valor Valido");
}
}


private static void converdPesoCopADolar (Monedas monedas, Scanner lectura , DecimalFormat numeroDecimal){double cop = monedas.getCop();
    System.out.println("Ingrese el valor que deseas convertir de Peso Colombiano  A Dolar");
    double valorenPesoCop = lectura.nextDouble();
    double valorenDolar = valorenPesoCop / cop;
    String valorFormateado= numeroDecimal.format(valorenDolar);
    if (valorenPesoCop >= 50){
        System.out.println("El valor de  " + valorenPesoCop + "Pesos Colombianos equivale en Dolares A " + valorFormateado + " $ Dolares" );
    }else {
        System.out.println("ingresa un valor valido");
    }
    }
private static void conversorDeDolarAPesoChileno(Monedas monedas, Scanner lectura , DecimalFormat numeroDecimal){
        double clp = monedas.getClp();
    System.out.println("Ingresa el valor que desea convvertir de Dolar  A Peso Chileno");
    double valorDolar = lectura.nextDouble();
    double valorPesoChileno = valorDolar * clp;
    String valorFormateado = numeroDecimal.format(valorPesoChileno);
    if (valorDolar >= 1) {
        System.out.println("El valor " + valorDolar + " Dolares ingresados equivalen A " + valorFormateado+ " Pesos Chilenos");
    }else {
        System.out.println("Ingrse un ValOR Valido");
    }
}
private static void conversorDePesoChilenoADolar(Monedas monedas, Scanner lectura, DecimalFormat numeroDecimal){
        double clp = monedas.getClp();
    System.out.println("Ingresa el valor que desea convertir de PesoChileno A Dolar");
    double valorPesoChileno = lectura.nextDouble();
    double valorDolar = valorPesoChileno / clp;
    String valotFormateado =numeroDecimal.format(valorDolar);
    if ( valorPesoChileno >= 1){
        System.out.println("El valor " + valorPesoChileno + " ingresado equivale A " + valotFormateado + "$ Dolares");

    }else {
        System.out.println("Ingresa un valor valido");
    }

}
private static void conversorDeDolarAPesoMexicano(Monedas monedas, Scanner lectura, DecimalFormat numeroDecimal){
        double mxn = monedas.getMxn();
    System.out.println("Ingresa el valor que desea convvertir de Dolar  A Peso Mexicano");
        double valorDolar = lectura.nextDouble();
        double valorPesoMexicano = valorDolar * mxn;
        String valorFormateado = numeroDecimal.format(valorPesoMexicano);
    if (valorDolar >= 10) {
        System.out.println("El valor " + valorDolar + " Dolares ingresados equivalen A " + valorFormateado+ " Pesos Mexicanos");
    }else {
        System.out.println("Ingresa un valor valido");
    }
}
private static void conversorDePesoMexicanoADolar(Monedas monedas, Scanner lectura, DecimalFormat numeroDecimal){

        double mxn = monedas.getMxn();
    System.out.println("Ingresa el valor que desea convertir de Peso Mexicano A Dolar");
        double valorPesoMexicano = lectura.nextDouble();
        double valorDolar = valorPesoMexicano / mxn;
        String valorFormateado = numeroDecimal.format(valorDolar);
        if (valorPesoMexicano >= 1){
            System.out.println("El valor " + valorPesoMexicano + " Peso Mexicano equivale A " + valorFormateado + "$ Dolares");
    }

    }

}







