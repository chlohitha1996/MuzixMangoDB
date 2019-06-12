package com.stackroute.exceptions;

public class TrackNotFoundException extends Exception {

    private String message;

    public TrackNotFoundException() {
        super();
    }

    public TrackNotFoundException(String message) {

        super(message);

    }
}


