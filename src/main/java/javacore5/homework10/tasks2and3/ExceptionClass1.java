package javacore5.homework10.tasks2and3;

public class ExceptionClass1 extends Exception {

    Exception reference = null;

    public ExceptionClass1(String exceptionArgument) {
        try {
            ((ExceptionClass1) reference).getReference();
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }

    public Exception getReference() {
        return reference;
    }
}
 