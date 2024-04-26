package main.weatherapp.client;

import main.weatherapp.model.CurrentWeather;

import java.net.MalformedURLException;

public interface WeatherClient {
        CurrentWeather getCurrentWeather(double lon, double lat) throws MalformedURLException;

}
