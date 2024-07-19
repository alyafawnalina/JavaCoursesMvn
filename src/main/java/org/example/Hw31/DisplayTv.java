package org.example.Hw31;

public class DisplayTv implements Observer{

    @Override
    public void update(int temperature) {
        System.out.println("Temperature displayed on the Tv is: " + temperature);
    }

}
