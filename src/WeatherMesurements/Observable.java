package WeatherMesurements;

public interface Observable {
    void RegisterObserver(Observer observer);
    void RemoveObserver(Observer observer);
    void notifyObservers();
}
