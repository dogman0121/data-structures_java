package lab2;

public class CantDeleteException extends RuntimeException {
    public CantDeleteException(String message) {
        super(message);
    }
}
