package src.main.java.com;

public class NotAValidNumberException extends Exception{
    public NotAValidNumberException(){
        super("This is not a valid number.\n");
    }

    public NotAValidNumberException(String message){
        super(message);
    }
}
