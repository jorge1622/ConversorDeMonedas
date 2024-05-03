import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerDatosApi extends Monedas {
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

        this.setCop(response.getConversion_rates().get("COP"));
        this.setArs(response.getConversion_rates().get("ARS"));
        this.setBrl(response.getConversion_rates().get("BRL"));
        this.setClp(response.getConversion_rates().get("CLP"));
        this.setMxn(response.getConversion_rates().get("MXN"));
    }

}
