package org.checkers;

public class BluePiece extends CheckerPieces{
    private String ANSI_BLUE = "\u001B[34m";
    private String ANSI_RESET = "\u001B[0m";


    public BluePiece(String name, String location) {
        super(name, location);
        super.nameWithColor = ANSI_BLUE + super.getName() + ANSI_RESET;

    }


}
