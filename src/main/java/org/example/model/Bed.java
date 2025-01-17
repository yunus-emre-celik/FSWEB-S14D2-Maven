package org.example.model;

public class Bed {
    private int style;
    private int pillows;
    private int height;
    private int sheets;
    private String quilts;

    public Bed(String quilts, int sheets, int height, int pillows, int style) {
        this.quilts = quilts;
        this.sheets = sheets;
        this.height = height;
        this.pillows = pillows;
        this.style = style;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public String getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }
    public int getStyle(){
        return style;
    }
}
