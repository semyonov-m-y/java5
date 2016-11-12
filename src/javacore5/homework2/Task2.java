package javacore5.homework2;

public class Task2 {

	public static void takeYourMoneyOnce(double startBalance, double withdrawal) {
		double comission = withdrawal*0.05;
		double withdrawalAndComission = withdrawal + comission;
		double balance = startBalance - withdrawalAndComission;

		if (startBalance >= withdrawalAndComission) {
			System.out.println("OK" + " " + comission + " " + balance);
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		takeYourMoneyOnce(100.0, 80);
		takeYourMoneyOnce(100.0, 99);
		takeYourMoneyOnce(100.0, 10);
		takeYourMoneyOnce(10.0, 5);
	}
}
