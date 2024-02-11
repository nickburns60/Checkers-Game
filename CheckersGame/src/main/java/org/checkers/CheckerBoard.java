package org.checkers;

public class CheckerBoard {
    //Used as a blank template for initializing piece locations
    private String checkerBoardCoordinates = """
            A1 A2 A3 A4 A5 A6 A7 A8
            B1 B2 B3 B4 B5 B6 B7 B8
            C1 C2 C3 C4 C5 C6 C7 C8
            D1 D2 D3 D4 D5 D6 D7 D8
            E1 E2 E3 E4 E5 E6 E7 E8
            F1 F2 F3 F4 F5 F6 F7 F8
            G1 G2 G3 G4 G5 G6 G7 G8
            H1 H2 H3 H4 H5 H6 H7 H8
            """;
    public String toString(){
        //create starting board
        //Board displays grid points (A-H and 1-9) but I'm still unsure of a good way to assign each checker its own
        //variable / value
        String checkerBoard = ("""
               +-------------------+
               +-----12345678------+
               +   A| o o o o|     +
               +   B|o o o o |     +
               +   C| o o o o|     +
               +   D|        |     +
               +   E|        |     +
               +   F|x x x x |     +
               +   G| x x x x|     +
               +   H|x x x x |     +
               +-------------------+
                
                """);
        return checkerBoard;

    }
    public String putPiecesOnBoard(CheckerPieces[] player1Pieces, CheckerPieces[] player2Pieces){
        String piecesOnBoard = this.checkerBoardCoordinates;
        for (CheckerPieces piece : player1Pieces) {
            piecesOnBoard = piecesOnBoard.replace(piece.getLocation(), piece.getNameWithColor());
        }
        for (CheckerPieces piece : player2Pieces) {
            piecesOnBoard = piecesOnBoard.replace(piece.getLocation(), piece.getNameWithColor());

        }
        return piecesOnBoard;
    }


}
