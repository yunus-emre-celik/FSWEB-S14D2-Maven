package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private int battery;
    private boolean globRating;

    public Lamp(LampType style, boolean globRating, int battery) {
        this.style = style;
        this.globRating = globRating;
        this.battery = battery;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public int isBattery() {
        return battery;
    }

    public LampType getStyle() {
        return style;
    }

    public boolean getGlobRating() {
        return globRating;
    }
}
