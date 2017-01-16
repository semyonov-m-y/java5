package main.java.homeworks.homework10;

public class MyClass3 extends Exception {
	public static void f() throws MyClass1, MyClass {
		g();
	}
	
	public static void g() throws MyClass {
		throw new MyClass("MyClass"); 
	}
}
