package org.example;

public class ZanniNotFound extends RuntimeException {

    private int statusCode = 0;

    public ZanniNotFound(String s) {
        super(s);
    }
    public ZanniNotFound(String s, int statusCode) {
        super(s);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
