package Сalculator;

public class FileLogger implements Logger {

    public void log(String message) {
        System.out.println("Log into file: {" + message + "}");
    }
}