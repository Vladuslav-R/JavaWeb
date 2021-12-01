package com.epam.utils;


    public class ReadException extends Exception {

        public ReadException() {
            super();
        }

        public ReadException(String message) {
            super(message);
        }

        public ReadException(String message, Throwable cause) {
            super(message, cause);
        }
    }

