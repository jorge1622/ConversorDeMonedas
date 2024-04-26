import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import static java.lang.Integer.valueOf;
public class Monedas  {




    private Map<String, Double> conversion_rates;

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;

        }
        private double dolar;

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



    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }



    public double getDolar() {
        return dolar;
    }

    public void obtenerDatosDeAPI() throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/994e5c3f068daab4e66386b2/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();


        HttpResponse<String> responseEEE = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = responseEEE.body();

        System.out.println(json);
        Gson gson = new Gson();
        Monedas response  = gson.fromJson(json, Monedas.class);
        Map<String, Double> conversionRates =response.getConversion_rates();
        Double cop = conversionRates.get("COP");
        Double usd = conversionRates.get("USD");
        Double ars = conversionRates.get("ARS");
        Double brl = conversionRates.get("BRL");

        this.setDolar(usd);
        this.setCop(cop);
        this.setArs(ars);
        this.setBrl(brl);
    }
}




















