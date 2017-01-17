package javacore5.homework10;

import javacore5.homework10.task4.FGClass;
import javacore5.homework10.task5.ThreeExceptionsClass;

public class MainClass {

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("string");
        } catch (Exception ex1) {
            System.out.println("It was a catch block.");
        } finally {
            System.out.println("It was a finally block.");
        }

        try {
            FGClass.ffunction();
        } catch (Exception ex2) {
            System.out.println("We caught all FG exceptions!");
        }

        try {
            ThreeExceptionsClass.threeExceptionsMethod();
        } catch (Exception ex3) {
            System.out.println("We caught all three exceptions!");
        }
    }
}
