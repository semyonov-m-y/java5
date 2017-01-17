package javacore5.homework10.task5;

import javacore5.homework10.tasks2and3.ExceptionClass1;

public class ExceptionClass2 extends Exception {
    public ExceptionClass2(String string) {

    }

    public static void ffunction() throws ExceptionClass1 {
        gfunction();
    }

    public static void gfunction() throws ExceptionClass1 {
        throw new ExceptionClass1("ExceptionClass1");
    }
}
