package org.checkers;
    /*
    COORDINATE SYSTEM:
      1. A coordinate layout is defined in CheckerBoard class
      2. The checker pieces are instantiated in a loop in the Player class with the method createPlayerPieces(). They
      are given a name (a number starting with 0 up to 11) and a location with one of the helper functions.
      3. These coordinates are interpreted in the CheckerBoard class by the method putPiecesOnBoard()
      TODO: Method for moving pieces does not remember previous moved pieces (they reset position on the next round)
      TODO: Method for moving pieces needs to only allow legal moves.
    */



import java.util.Scanner;

public class Main {
    private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_RESET = "\u001B[0m";
    private static String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CheckerBoard checkerBoard = new CheckerBoard();
        Player player1 = new Player("red");
        Player player2 = new Player("blue");

        //Demonstrates coordinate system
        System.out.println(checkerBoard.putPiecesOnBoard(player1.getPieces(), player2.getPieces()));
        System.out.println("Welcome to checkers!");
        //Selects the pieces the user will use based on their input
        System.out.println("As you can see, our pieces each have their own number, and each space has it's own" +
                " letter and number. To move a piece, type the piece you would like to move, then a space, then the position you want it to move to.");
        System.out.println("Like this:  00 E2");
        System.out.println();

        while (true){
            boolean illegalMove = true;
            while (illegalMove){
                try {
                    System.out.println(ANSI_RED + "Player 1:" + ANSI_RESET + " make your move.");
                    //Captures piece number and location to move it to
                    String[] playerMove = input.nextLine().toUpperCase().split(" ");
                    //Makes sure piece is not placed on another piece
                    player1.checkPiece(playerMove[1]);
                    player1.movePiece(playerMove[0], playerMove[1]);
                    //Meant to reprint board after changes are made
                    System.out.println(checkerBoard.putPiecesOnBoard(player1.getPieces(), player2.getPieces()));
                    System.out.println();
                    illegalMove = false;
                }catch (MoveException e){
                    //throws error message when a piece is placed on another
                    System.err.println(e.getMessage());
                }
            }
            //Above repeated for second player
            while (!illegalMove){
                try {
                    System.out.println(ANSI_BLUE + "Player 2:" + ANSI_RESET + " make your move.");
                    String[] playerMove = input.nextLine().toUpperCase().split(" ");
                    player2.checkPiece(playerMove[1]);
                    player2.movePiece(playerMove[0], playerMove[1]);
                    System.out.println(checkerBoard.putPiecesOnBoard(player1.getPieces(), player2.getPieces()));
                    System.out.println();
                    illegalMove = true;
                } catch (MoveException e) {
                    System.err.println(e.getMessage());
                }
            }



        }

    }
}