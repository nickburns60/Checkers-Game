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

     BEAU - Maybe we could create a method in each subclass that instantiates and names 12 objects from each subclass and
     then puts them into a list? Then we wouldn't need to have local variables in the Main class and we could just use
     class methods to move pieces.
       - for example, each subclass could have a method called movePiece(String pieceName, String destination) that would
       take the desired piece and move it to the desired destination. We would need some logic in there to make sure it
       is a legal move though.
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
