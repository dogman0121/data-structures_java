package lab2.Task4.Exceptions;

public class CantDeleteException extends RuntimeException {
    public CantDeleteException(String message) {
        super(message);
    }
}
