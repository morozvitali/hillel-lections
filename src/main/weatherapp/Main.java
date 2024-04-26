package main.weatherapp;

import main.weatherapp.client.OpenWeatherMapClient;
import main.weatherapp.model.CurrentWeather;

import java.net.http.HttpClient;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        OpenWeatherMapClient openWeatherMapClient = new OpenWeatherMapClient(HttpClient.newBuilder().build());
        CurrentWeather currentWeather = openWeatherMapClient.getCurrentWeather(9.5, 48);

        new WeatherUI();

    }
}
