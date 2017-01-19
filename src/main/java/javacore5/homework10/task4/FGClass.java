package javacore5.homework10.task4;

import javacore5.homework10.task5.ExceptionClass2;
import javacore5.homework10.task2.ExceptionClass1;

public class FGClass {

    public static void ffunction() throws ExceptionClass2, ExceptionClass1 {
        try {
            gfunction();
        } catch (ExceptionClass1 ex) {
            throw new ExceptionClass2(new ExceptionClass1("ExceptionClass2"));
        }
    }

    public static void gfunction() throws ExceptionClass1 {
        throw new ExceptionClass1("ExceptionClass1");
    }
}
