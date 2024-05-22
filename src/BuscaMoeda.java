import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaMoeda {
    public String endereco(String moeda, String moedaNova) {
        String apiKey = "685e6680b343b03aa0bf3615";
        return "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moeda + "/" + moedaNova;
    }

    public Double buscaMoeda (String endereco) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject jsonObject = new JsonParser().parse(response.body()).getAsJsonObject();
            return jsonObject.get("conversion_rate").getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Opção inválida!");
        }
    }
}
