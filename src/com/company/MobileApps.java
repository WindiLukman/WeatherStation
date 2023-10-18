package com.company;

import java.util.Observable;
import java.util.Observer;

public class MobileApps implements Observer, DisplayElement{
    Observable observable;
    private double temp;
    private double humidity;
    private double pressure;

    public MobileApps(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display(){
        System.out.println("-------- Mobile Weather Application --------");
        System.out.println("Temperature: " + temp + "C");
        System.out.println("Humidity :" + humidity + "%");
        System.out.println("Pressure :" + pressure  + "hPa");
        System.out.println("--------------------------------------------");
    }

    public void update(Observable obs, Object arg){
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            temp = weatherData.getTemp();
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
        }
    }
}
