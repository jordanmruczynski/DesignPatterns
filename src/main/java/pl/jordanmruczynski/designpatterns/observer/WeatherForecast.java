package pl.jordanmruczynski.observerdesignpattern;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        registeredObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        registeredObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        registeredObservers.forEach(observer -> observer.updateForecast(this));
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
