package org.checkers;

public class CheckerBoard {
    public String toString(){
        //create starting board
        //Board displays grid points (A-H and 1-9) but I'm still unsure of a good way to assign each checker its own
        //variable / value
        String checkerBoard = ("""
               +-------------------+
               +-----12345678------+
               +   A| o o o o|     +
               +   B|o o o o |     +
               +   C| o o o o|     +
               +   D|        |     +
               +   E|        |     +
               +   F|x x x x |     +
               +   G| x x x x|     +
               +   H|x x x x |     +
               +-------------------+
                
                """);
        return checkerBoard;

    }
}
