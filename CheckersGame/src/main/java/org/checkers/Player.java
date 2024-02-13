package org.checkers;

public class Player {
    //variables
    private CheckerPieces[] pieces = new CheckerPieces[12];

    private String pieceToMove; //Player selected piece to move

    private String movePieceTo; //User selected place to move piece to

    public void setPieceToMove(String pieceToMove) {
        this.pieceToMove = pieceToMove;
    }

    public void setMovePieceTo(String movePieceTo) {
        this.movePieceTo = movePieceTo;
    }

    //constructor
    public Player(String redOrWhite) {
        createPlayerPieces(redOrWhite);
    }


    //getters/setters


    //class methods
    //This method instantiates all the pieces in the associated array, then uses their constructor to name them the current i number
    private void createPlayerPieces(String redOrWhite) {
        String currentLocation;

        //This logic will fill the players pieces depending on whether the player chooses white or red.
        if (redOrWhite.equalsIgnoreCase("white")){
            for (int i = 0; i < pieces.length; i++) {
                currentLocation = initializeWhitePieceLocations(i);
                pieces[i] = new WhitePiece(String.valueOf(i), currentLocation);

                //Want this if() to set the current piece equal to the location the user enters
                //but I can't get it to function because pieces is the CheckerPieces[] variable type
                if(pieces[i].toString().equals(pieceToMove)){
                    pieces[i] = new WhitePiece(String.valueOf(i), movePieceTo);
                }
            }
        } else if (redOrWhite.equalsIgnoreCase("red")) {
            for (int i = 0; i < pieces.length; i++) {
                currentLocation = initializeRedPieceLocations(i);
                pieces[i] = new RedPiece(String.valueOf(i), currentLocation);

                //Want this if() to set the current piece equal to the location the user enters
                if(pieces[i].toString().equals(pieceToMove)){
                    pieces[i] = new RedPiece(String.valueOf(i), movePieceTo);
                }
            }
        }
    }

    private String initializeWhitePieceLocations(int i) {
        String currentLocation;
        if (i < 4) {
            currentLocation = "F" + (i * 2 + 1); //even spaces
        } else if (i < 8) {
            currentLocation = "G" + ((i - 4) * 2 + 2); //odd spaces
        } else {
            currentLocation = "H" + ((i - 8) * 2 + 1); //even spaces
        }
        return currentLocation;
    }
    private String initializeRedPieceLocations(int i) {
        String currentLocation;
        if (i < 4) {
            currentLocation = "A" + (i * 2 + 2); //odd spaces
        } else if (i < 8) {
            currentLocation = "B" + ((i - 4) * 2 + 1); //even spaces
        } else {
            currentLocation = "C" + ((i - 8) * 2 + 2); //odd spaces
        }
        return currentLocation;
    }

    public CheckerPieces[] getPieces() {
        return pieces;
    }

}
