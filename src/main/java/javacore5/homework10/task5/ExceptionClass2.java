package javacore5.homework10.task5;

import javacore5.homework10.task2.ExceptionClass1;

public class ExceptionClass2 extends Exception {

    public ExceptionClass2(ExceptionClass1 exceptionClass1) {
        super(exceptionClass1);
    }

    public ExceptionClass2(String string) {
        System.out.println();
    }
}
