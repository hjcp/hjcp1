package net.hjcp.Exceptions;

public class ReadDataException extends Exception {
    public ReadDataException() {
    }

    public ReadDataException(String message) {
        super(message);
    }

    public ReadDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadDataException(Throwable cause) {
        super(cause);
    }
}
