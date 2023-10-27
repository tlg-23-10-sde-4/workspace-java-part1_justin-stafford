package edu.geometry;

public class IllegalNumberException extends Exception {

    public IllegalNumberException() {

    }

    public IllegalNumberException(String message) {
        super(message);
    }

    public IllegalNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalNumberException(Throwable cause) {
        super(cause);
    }
}
