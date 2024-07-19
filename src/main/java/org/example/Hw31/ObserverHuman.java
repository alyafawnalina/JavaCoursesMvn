package org.example.Hw31;

import java.util.Objects;

public class ObserverHuman implements Observer{

    private final String name;
    private final String device;

    public ObserverHuman(String name, String device) {
        this.name = name;
        this.device = device;
    }

    @Override
    public String toString() {
        return "ObserverHuman{" +
                "name='" + name + '\'' +
                ", device='" + device + '\'' +
                '}';
    }

    @Override
    public void update(int temperature) {

        switch (device) {
            case "Phone":
                DisplayPhone displayPhone = new DisplayPhone();
                displayPhone.update(temperature);
                break;

            case "Tv":
                DisplayTv displayTv = new DisplayTv();
                displayTv.update(temperature);
                break;
        }

        System.out.println("Temperature is displayed to " + this.name + ".\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObserverHuman that = (ObserverHuman) o;
        return Objects.equals(name, that.name) && Objects.equals(device, that.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, device);
    }

}
