package org.checkers;
    /*
    TODO: Create Checker superclass, RedChecker and BlackChecker subclasses
        - Maybe we have a static counter on the Checker superclass in order to assign a number to each new checker
        piece upon instantiation? Or we could assign them manually. I was just thinking the CheckerBoard output would be more useful if
        each checker had a number, so it would be easier to choose which one to move.

    TODO: Create coordinate system on checker class? Or on CheckerBoard class?
        - leaning towards storing the coordinate on the checker and then having a method that reads the coordinate on
        the CheckerBoard class.

    TODO: Design main class for game flow

    TODO: Build CheckerBoard class for output
     
     */

public class Main {
    public static void main(String[] args) {
        CheckerBoard checkerBoard = new CheckerBoard();
        System.out.println(checkerBoard);
        //  while (true){

        // }

    }
}