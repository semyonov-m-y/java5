package javacore5.homework10.task5;

import javacore5.homework10.task2.ExceptionClass1;

public class ThreeExceptionsClass extends Exception {

    public static void threeExceptionsMethod(int number) throws ExceptionClass2, ExceptionClass3, ExceptionClass4 {
        if (number == 1) {
            throw new ExceptionClass2(new ExceptionClass1("MyClass1"));
        }
        if (number == 0) {
            throw new ExceptionClass3("ExceptionClass3");
        }
        if (number == -1) {
            throw new ExceptionClass4("");
        }
    }
}
