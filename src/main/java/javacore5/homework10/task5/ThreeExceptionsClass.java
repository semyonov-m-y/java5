package javacore5.homework10.task5;

public class ThreeExceptionsClass extends Exception {

    public static void threeExceptionsMethod() throws ExceptionClass2, ExceptionClass3, ExceptionClass4 {
        try {
            try {
                throw new ExceptionClass3("ExceptionClass3");
            } finally {
                throw new ExceptionClass4();
            }
        } finally {
            throw new ExceptionClass2("ExceptionClass2");
        }
    }
}
