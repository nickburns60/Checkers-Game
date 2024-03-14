package org.checkers;

public class MoveException extends Exception{
    public MoveException(){
        super();
    }
    public MoveException(String message){
        super(message);
    }
    public MoveException(String message, Exception cause){
        super(message, cause);
    }
}
