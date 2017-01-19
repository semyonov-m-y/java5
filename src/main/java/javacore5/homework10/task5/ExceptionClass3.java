package javacore5.homework10.task5;

import javacore5.homework10.task2.ExceptionClass1;

public class ExceptionClass3 extends Exception {
    public ExceptionClass3(String string) {
    }

    public static void ffunction() throws ExceptionClass2 {
        gfunction();
    }

    public static void gfunction() throws ExceptionClass2 {
        throw new ExceptionClass2(new ExceptionClass1("ExceptionClass2"));
    }
}
