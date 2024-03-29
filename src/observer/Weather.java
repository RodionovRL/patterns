package observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;
    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }
    public void addObserver(WeatherObserver obs) {
        observers.add(obs);
    }
    public void removeObserver(WeatherObserver obs) {
        observers.remove(obs);
    }
    public void timePasses() {
        var enumValues = WeatherType.values();
        System.out.println("... A few moments later ...");
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.printf("The weather changed to %s.\n", currentWeather);
        notifyObservers();
    }
    private void notifyObservers() {
        for (var obs : observers) {
            obs.update(currentWeather);
        }
    }
}
