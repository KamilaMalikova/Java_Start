package WeatherMesurements;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement{
    //private WeatherData weatherData;
    java.util.Observable observable;
    private float Temperature;
    private float Humidity;
    private float Pressure;

    public CurrentConditionsDisplay(java.util.Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.Temperature = weatherData.getTemperature();
            this.Humidity = weatherData.getHumidity();
            this.Pressure = weatherData.getPressure();
            this.display();}
    }

    @Override
    public void display() {
        System.out.println("Current conditions: temperature "+this.Temperature+" F degree and "+this.Humidity+" humidity.\n Pressure: "+this.Pressure);
    }

}
