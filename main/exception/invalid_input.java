package main.exception;

public class invalid_input extends RuntimeException{
    public invalid_input(String msg){
        super(msg);
    }
}
