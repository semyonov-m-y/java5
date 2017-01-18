package javacore5.homework10.task2;

public class ExceptionClass1 extends Exception {

    private String reference;

    public ExceptionClass1(String exceptionArgument) {
        reference = exceptionArgument;
    }

    public String getReference() {
        return reference;
    }
}
 