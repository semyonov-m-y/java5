package javacore5.homework10.task5;

public class ExceptionClass4 extends Exception {

    public static void ffunction() throws ExceptionClass3 {
        gfunction();
    }

    public static void gfunction() throws ExceptionClass3 {
        throw new ExceptionClass3("ExceptionClass3");
    }
}
