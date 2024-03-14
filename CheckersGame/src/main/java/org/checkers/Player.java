package org.checkers;

public class Player {
    //variables
    private CheckerPieces[] pieces = new CheckerPieces[12];


    //constructor
    public Player(String redOrBlue) {
        createPlayerPieces(redOrBlue);
    }


    //getters/setters


    //class methods
    //This method instantiates all the pieces in the associated array, then uses their constructor to name them the current i number
    public void createPlayerPieces(String redOrBlue) {
        String currentLocation;

        //This logic will fill the players pieces depending on whether the player chooses blue or red.
        if (redOrBlue.equalsIgnoreCase("blue")){
            for (int i = 0; i < pieces.length; i++) {
                currentLocation = initializeBluePieceLocations(i);
                pieces[i] = new BluePiece(String.valueOf(i), currentLocation);
            }
        } else if (redOrBlue.equalsIgnoreCase("red")) {
            for (int i = 0; i < pieces.length; i++) {
                currentLocation = initializeRedPieceLocations(i);
                pieces[i] = new RedPiece(String.valueOf(i), currentLocation);

            }
        }
    }
    public void checkPiece(String location) throws MoveException{
        for(CheckerPieces piece : pieces){
            if (location.equals(piece.getLocation())){
                throw new MoveException("Space entered is occupied, select an open space");
            }
        }

    }
    public void movePiece(String name, String location) {
        for (CheckerPieces piece : pieces) {
            if (piece.getName().equals(name)){
                piece.setLocation(location);
            }
        }
    }

    private String initializeBluePieceLocations(int i) {
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
