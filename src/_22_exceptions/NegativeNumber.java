package _22_exceptions;

public class NegativeNumber extends Exception {
    private int  number;

    public NegativeNumber( int number,String message) {
        super(message);
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

}
