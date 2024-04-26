package main.weatherapp.model;

import java.util.Objects;

public class MainWeather {
    private double humidity;

    public MainWeather(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainWeather that = (MainWeather) o;
        return Double.compare(humidity, that.humidity) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(humidity);
    }

    @Override
    public String toString() {
        return "MainWeather{" +
                "humidity=" + humidity +
                '}';
    }


    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
