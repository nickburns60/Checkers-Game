package org.checkers;

import java.util.ArrayList;
import java.util.List;

public class CheckerPieces {
    private String ANSI_RESET = "\u001B[0m";
    private String name;
    protected String nameWithColor;
    private String location;

    /*
    Make an arrayList that is the size of the amount of
    pieces for 1 player (12). Make this a protected list so the child
    classes can access it but it doesn't appear in other classes.
    This will also need getters and setters / a constructor to allow
    child classes to make their own lists for each player's pieces
     */
     /*
     The child classes ideally would extend this class and use a setter to set values for each of their own 12 pieces.
     It would also be great if we could color code the pieces so they can all be o's instead of x and o's.

     FIXME: I moved the list of pieces to the player class because I felt that that is more a property of the player
      than the pieces themselves.
     */

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
