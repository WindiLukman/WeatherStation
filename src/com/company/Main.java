package com.company;
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        MobileApps mobileApps = new MobileApps(weatherData);
        Widget widget = new Widget(weatherData);

        weatherData.setMeasurements(35, 78, 1012);
        weatherData.setMeasurements(37, 80, 1013);
        weatherData.setMeasurements(36, 79, 1015);
    }
}