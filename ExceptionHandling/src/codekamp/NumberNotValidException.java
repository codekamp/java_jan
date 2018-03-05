package codekamp;

public class NumberNotValidException extends Exception {

    public String reason;

    public NumberNotValidException(String reason) {
        super();
        this.reason = reason;
    }
}