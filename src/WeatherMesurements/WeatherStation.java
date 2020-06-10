package WeatherMesurements;

import jdk.dynalink.beans.StaticClass;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasureData(80, 65, 30.02f);
        weatherData.setMeasureData(82, 70, 29.02f);
        weatherData.setMeasureData(78, 90, 29.0f);
    }
}
