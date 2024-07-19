package org.example.Hw31;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherStation {

    private final List<ObserverHuman> observers;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void addObserver(ObserverHuman observer){
        observers.add(observer);
    }

    public void removeObserver(ObserverHuman observer){
        observers.remove(observer);
    }

    public void notifyObserver(int temperature){
        for (ObserverHuman el : observers) {
            el.update(temperature);
        }
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "observers=" + observers +
                '}';
    }

}
