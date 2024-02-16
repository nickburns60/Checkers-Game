package org.checkers;


import java.util.Scanner;

public class CheckerPieces {
    private String ANSI_RESET = "\u001B[0m";
    private String name;
    protected String nameWithColor;
    private String location;


    public CheckerPieces(String name, String location) {
        //this conditional adds a 0 to single digit numbers to make each name exactly 2 characters. For spacing.
        if (name.length() < 2) {
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
