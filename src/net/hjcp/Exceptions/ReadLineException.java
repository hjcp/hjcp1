package net.hjcp.Exceptions;

public class ReadLineException extends Exception {
    public ReadLineException() {
    }

    public ReadLineException(String message) {
        super(message);
    }

    public ReadLineException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadLineException(Throwable cause) {
        super(cause);
    }
}
