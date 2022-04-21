package ge.dm.jdk9;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SimpleRequest {

    private void createRequest() throws URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();

//        HttpResponse<String> response = HttpClient.newHttpClient()
//                .send(request, HttpResponse.BodyHandler.asString());
    }


}
