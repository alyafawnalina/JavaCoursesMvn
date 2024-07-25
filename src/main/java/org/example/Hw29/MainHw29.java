package org.example.Hw29;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainHw29 {

    public static void main(String[] args) throws URISyntaxException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            try {
                ObjectMapper objectMapper = new ObjectMapper();
                Users users = objectMapper.readValue(response.body(), Users.class);
                System.out.println(users.toString());

            } catch (JsonProcessingException e) {throw new RuntimeException(e);}

        } catch (IOException | InterruptedException e) {throw new RuntimeException(e);}

    }

}
