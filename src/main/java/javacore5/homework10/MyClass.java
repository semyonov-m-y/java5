package main.java.homeworks.homework10;

public class MyClass extends Exception {
	
	String reference = null;
	public MyClass(String arg0) {
		super(arg0);
		try {
		reference = arg0;
		} catch (Exception e) {
			System.out.println("My class exception.");
		}
	}

	public static void print(String string) {
		try {
		System.out.println(string);
		} catch (Exception mc) {
			
		}
	}

}
