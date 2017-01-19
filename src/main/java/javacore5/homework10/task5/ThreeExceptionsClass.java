package javacore5.homework10.task5;

import javacore5.homework10.task2.ExceptionClass1;

public class ThreeExceptionsClass extends Exception {

    public static void threeExceptionsMethod(Exception exception) throws ExceptionClass2, ExceptionClass3, ExceptionClass4 {
        if (exception instanceof ExceptionClass2) {
            throw new ExceptionClass2(new ExceptionClass1(""));
        }
        if (exception instanceof ExceptionClass3) {
            throw new ExceptionClass3("");
        }
        if (exception instanceof ExceptionClass4) {
            throw new ExceptionClass4();
        }
    }
}
