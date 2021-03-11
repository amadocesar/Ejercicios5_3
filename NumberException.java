package Ejercicio5_13;

public class NumberException extends Exception{
    public NumberException(String message){ super("Esto no es un numero: "+ message);}

    @Override
    public String getMessage(){ return super.getMessage(); }
}
