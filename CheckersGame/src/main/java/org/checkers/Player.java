package org.checkers;

public class Player {
    //variables
    RedPiece[] redPieces = new RedPiece[12];
    WhitePiece[] whitePieces = new WhitePiece[12];


    //constructor
    public Player(String redOrWhite) {
        createPlayerPieces(redOrWhite);
    }

    //getters/setters


    //class methods
    //This method instantiates all the pieces in the associated array, then uses their constructor to name them the current i number
    private void createPlayerPieces(String redOrWhite) {
        if (redOrWhite.equalsIgnoreCase("white")){
            for (int i = 0; i < whitePieces.length; i++) {
                whitePieces[i] = new WhitePiece(String.valueOf(i));
            }
        } else if (redOrWhite.equalsIgnoreCase("red")) {
            for (int i = 0; i < redPieces.length; i++) {
                redPieces[i] = new RedPiece(String.valueOf(i));
            }
        }
    }
}
