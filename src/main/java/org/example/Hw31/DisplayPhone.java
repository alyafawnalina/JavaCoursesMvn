package org.example.Hw31;

public class DisplayPhone implements Observer{

    @Override
    public void update(int temperature) {
        System.out.println("Temperature displayed to on the Phone is: " + temperature);
    }

}
