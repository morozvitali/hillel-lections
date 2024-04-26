package main.weatherapp.client;

import main.weatherapp.model.CurrentWeather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class OpenWeatherMapClient implements WeatherClient {

    private static final String API_KEY = "80fb006bebff100e6448a01428a00caf";
    private HttpClient httpClient;
    private static final String BASE_URL = "https://api.openweathermap.org";
    private static final String DATA_PATH = "/data/2.5/weather";

    public OpenWeatherMapClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public CurrentWeather getCurrentWeather(double lon, double lat) {
        try {
            String params = String.format("?lat=%f&lon=%fappid=%s&units=metric", lat, lon, API_KEY);
            HttpRequest request = HttpRequest.newBuilder().GET().uri(new URI(BASE_URL+DATA_PATH+params)).build();
            HttpResponse <String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());


        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
