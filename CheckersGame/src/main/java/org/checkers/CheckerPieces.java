package org.checkers;


import java.util.Scanner;

public class CheckerPieces {
    private String ANSI_RESET = "\u001B[0m";
    private String name;
    protected String nameWithColor;
    private String location;

   private String newLocation;

    public String getNewLocation() {
        return newLocation;
    }

    public void setNewLocation(String newLocation) {
        this.newLocation = newLocation;
    }

    public CheckerPieces(String name, String location) {
        //this conditional adds a 0 to single digit numbers to make each name exactly 2 characters. For spacing.
        if (Integer.parseInt(name) < 10) {
            this.name = "0" + name;
        } else {
            this.name = name;
        }
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getNameWithColor() {
        return nameWithColor;
    }
}
