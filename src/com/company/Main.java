package com.company;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        MobileApps mobileApps = new MobileApps(weatherData);
        Widget widget = new Widget(weatherData);

        weatherData.setMeasurements(35, 78, 1012);
        weatherData.setMeasurements(32, 80, 1020);
        weatherData.setMeasurements(33, 79, 1013);
    }
}