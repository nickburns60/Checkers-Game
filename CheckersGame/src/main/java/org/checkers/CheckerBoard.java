package org.checkers;

public class CheckerBoard {
    private final String ANSI_BLACK = "\u001B[40m";
    private final String ANSI_RESET = "\u001B[0m";
    //Used as a blank template for initializing piece locations
    private String checkerBoardCoordinates = """
            ---------------------------
            | A1 A2 A3 A4 A5 A6 A7 A8 | 
            | B1 B2 B3 B4 B5 B6 B7 B8 | 
            | C1 C2 C3 C4 C5 C6 C7 C8 | 
            | D1 D2 D3 D4 D5 D6 D7 D8 | 
            | E1 E2 E3 E4 E5 E6 E7 E8 | 
            | F1 F2 F3 F4 F5 F6 F7 F8 | 
            | G1 G2 G3 G4 G5 G6 G7 G8 | 
            | H1 H2 H3 H4 H5 H6 H7 H8 | 
            ---------------------------
            """;

    private String colorCheckerBoardSpaces(String uncoloredCheckerBoard){
        String coloredCheckerBoard = "";
        String[] allSpaces = uncoloredCheckerBoard.split(" ");

        for (int i = 0; i < allSpaces.length; i++) {
            if (i % 2 != 0){
                if (allSpaces[i].contains(ANSI_RESET)) { //The checker pieces already have an ANSI reset code, this ensures we only add a reset code to spaces
                    allSpaces[i] = ANSI_BLACK + allSpaces[i];
                } else {
                    allSpaces[i] = ANSI_BLACK + allSpaces[i] + ANSI_RESET;
                }
            }
            coloredCheckerBoard += allSpaces[i] + " ";
        }
        return coloredCheckerBoard;
    }

    public String putPiecesOnBoard(CheckerPieces[] player1Pieces, CheckerPieces[] player2Pieces){
        String piecesOnBoard = this.checkerBoardCoordinates;
        for (CheckerPieces piece : player1Pieces) {
            piecesOnBoard = piecesOnBoard.replace(piece.getLocation(), piece.getNameWithColor());
        }
        for (CheckerPieces piece : player2Pieces) {
            piecesOnBoard = piecesOnBoard.replace(piece.getLocation(), piece.getNameWithColor());

        }
        return colorCheckerBoardSpaces(piecesOnBoard);
    }



}
