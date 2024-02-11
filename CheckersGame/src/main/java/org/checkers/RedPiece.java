package org.checkers;

import java.util.List;

public class RedPiece extends CheckerPieces{
    private String ANSI_RED = "\u001B[31m";
    private String ANSI_RESET = "\u001B[0m";
    public RedPiece(String name, String location) {
        super(name, location);
        super.nameWithColor = ANSI_RED + super.getName() + ANSI_RESET;
    }

    public RedPiece(List<String> pieces) {
        super(pieces);
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
