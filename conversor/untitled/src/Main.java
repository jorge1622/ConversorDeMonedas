import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


                try {
               obrebe obrebe = new obrebe();
                   daaaa datosApi = obrebe.obrebe();
                    // Acceder a los datos de la API
                    Map<String, Double> conversionRates = datosApi.getConversionRates();
                    Double cop = conversionRates.get("COP");
                    Double ars = conversionRates.get("ARS");
                    Double brl = conversionRates.get("BRL");


                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


