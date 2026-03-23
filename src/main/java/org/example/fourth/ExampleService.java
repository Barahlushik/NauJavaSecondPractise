package org.example.fourth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExampleService {
    private static final String URL = "https://httpbin.org/anything";

    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();

    public String fetchAcceptHeader() {

        try {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .header("Accept", "*/*")
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonNode json = mapper.readTree(response.body());
            return json
                    .path("headers")
                    .path("Accept")
                    .asText("Accept не найден");

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ошибка запроса", e);
        }
    }
}
