import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class obrebe {
    public daaaa obrebe() throws IOException, InterruptedException {
            String direccion = "https://v6.exchangerate-api.com/v6/994e5c3f068daab4e66386b2/latest/USD";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new Gson();
            daaaa  datosApil = gson.fromJson(json, daaaa.class);

            return datosApil;
        }
    }



