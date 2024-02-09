package org.checkers;

public class CheckerBoard {
    public String toString(){
        //create starting board
        String checkerBoard = ("""
               +-------------------+
               +    | o o o o|     +
               +    |o o o o |     +
               +    | o o o o|     +
               +    |        |     +
               +    |        |     +
               +    |o o o o |     +
               +    | o o o o|     +
               +    |o o o o |     +
               +-------------------+
                
                """);
        return checkerBoard;
    }
}
