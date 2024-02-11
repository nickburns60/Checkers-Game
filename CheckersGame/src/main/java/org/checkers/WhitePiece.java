package org.checkers;

import java.util.List;

public class WhitePiece extends CheckerPieces{
    private String ANSI_WHITE = "\u001B[37m";
    private String ANSI_RESET = "\u001B[0m";
    public WhitePiece(List<String> pieces) {
        super(pieces);
    }

    public WhitePiece(String name) {
        super(name);
        super.nameWithColor = ANSI_WHITE + name + ANSI_RESET;

    }

    @Override //Sample setup to put the pieces into a list, so they all have their own index
    public void setPieces(List<String> pieces) {
        super.setPieces(pieces);
        for(String piece : pieces){
            pieces.add("o");
        }
    }
    public String toString(){
        return pieces.toString();
    }

}
