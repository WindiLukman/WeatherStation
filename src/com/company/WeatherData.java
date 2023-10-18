package com.company;
import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;

public class WeatherData extends Observable {
    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData(){

    }

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(double temp, double humidity, double pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}

