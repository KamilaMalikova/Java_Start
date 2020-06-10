package WeatherMesurements;

import java.util.Observable;
import java.util.ArrayList;

public class WeatherData extends java.util.Observable{
 //   private ArrayList<Observer> Observers = new ArrayList<Observer>();
    private float Temperature;
    private float Humidity;
    private float Pressure;

    public WeatherData(){  };

    public float getTemperature() {
        return Temperature;
    }

    public float getHumidity() {
        return Humidity;
    }

    public float getPressure() {
        return Pressure;
    }

    /*@Override
    public void RegisterObserver(Observer observer) {
        this.Observers.add(observer);
    }

    @Override
    public void RemoveObserver(Observer observer) {
        int i = this.Observers.indexOf(observer);
        if (i >= 0) this.Observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.Observers) {
            observer.update();
        }
    }*/

    public void measurmentsChanged(){
        setChanged();
        notifyObservers();
        //this.notifyObservers();
    }
    public void setMeasureData(float temperature, float humidity, float pressure){
        this.Temperature = temperature;
        this.Humidity = humidity;
        this.Pressure = pressure;
        measurmentsChanged();
    }


}
