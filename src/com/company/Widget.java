package com.company;

import java.util.Observable;
import java.util.Observer;


public class Widget implements Observer, DisplayElement{
    Observable observable;
    private double temp;

    public Widget(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display(){
        System.out.println("-------- Widget --------");
        System.out.println("Temperature:" + temp + "C");
    }

    public void update(Observable obs, Object arg){
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            temp = weatherData.getTemp();
            display();
        }
    }
}