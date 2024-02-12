package org.checkers;

import java.util.List;

public class WhitePiece extends CheckerPieces{
    private String ANSI_WHITE = "\u001B[37m";
    private String ANSI_RESET = "\u001B[0m";


    public WhitePiece(String name, String location) {
        super(name, location);
        super.nameWithColor = ANSI_WHITE + super.getName() + ANSI_RESET;

    }


}
