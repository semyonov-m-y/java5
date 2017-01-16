package main.java.homeworks.homework10;

public class MainClass {

	public static void main(String[] args) throws Exception {
		try {
			
		} catch (Exception ex) {
			System.out.println("It was a catch block.");
		} finally {
			System.out.println("It was a finally block.");
		}
		
		try {
		FGClass.f();
		} catch (Exception ex3) {
			System.out.println("We caught all FG exceptions!");
		}
		
		try {
			ThreeExceptionsClass.threeExceptionsMethod();
		} catch (Exception ex3) {
			System.out.println("We caught all three exceptions!");
		}
	}
}
