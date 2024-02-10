package org.checkers;

import java.util.List;

public class WhitePieces extends CheckerPieces{
    public WhitePieces(List<String> pieces) {
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
