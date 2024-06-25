package service;

import api.openWeather.currentWeather.OWResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@NoArgsConstructor
public class HttpClientService<T> {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();


    public String getResponse(String url) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("accept", "application/json")
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//           System.out.println(response3.body());

        String json = response.body();
        //        System.out.println(objectResponse);

//        System.out.println("Current weather for city Zabrze: " + "\n" + objectResponse.getMain());
        return response.body();
    }
}
