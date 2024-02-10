package org.checkers;

import java.util.ArrayList;
import java.util.List;

public class CheckerPieces {
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
     */
    protected List<String> pieces = new ArrayList<>(12);

    public CheckerPieces(List<String> pieces) {
        this.pieces = pieces;
    }

    public List<String> getPieces() {
        return pieces;
    }

    public void setPieces(List<String> pieces) {
        this.pieces = pieces;
    }
}
