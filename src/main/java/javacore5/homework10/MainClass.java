package javacore5.homework10;

import javacore5.homework10.task4.FGClass;
import javacore5.homework10.task5.ExceptionClass2;
import javacore5.homework10.task5.ExceptionClass3;
import javacore5.homework10.task5.ExceptionClass4;
import javacore5.homework10.task5.ThreeExceptionsClass;
import javacore5.homework10.task2.ExceptionClass1;

public class MainClass {

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("string");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("It was a finally block.");
        }

        try {
            ExceptionClass1 reference = null;
            reference.getReference();
        } catch (NullPointerException ex1) {
            System.out.println(ex1);
        }

        try {
            FGClass.ffunction();
        } catch (Exception ex2) {
            System.out.println("We caught all FG exceptions!");
        }

        try {
            ThreeExceptionsClass.threeExceptionsMethod(new ExceptionClass2(new ExceptionClass1("")));
            ThreeExceptionsClass.threeExceptionsMethod(new ExceptionClass3(""));
            ThreeExceptionsClass.threeExceptionsMethod(new ExceptionClass4());
        } catch (Exception ex3) {
            System.out.println("We caught all three exceptions!");
        }
    }
}
