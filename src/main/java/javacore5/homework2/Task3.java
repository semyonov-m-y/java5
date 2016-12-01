package main.java.javacore5.homework2;

public class Task3 {

	static int[] balances = {1200, 250, 2000, 500, 3200};
	static String[] ownerNames = {"Jane", "Ann", "Jake", "Oww", "Lane"};

	public static void takeMoneyOfExactOwner(String ownerName, double withdrawal) {
		double withdrawalAndComission = withdrawal + (withdrawal*0.05);

		for (int i = 0; i < ownerNames.length; i++) {
			if(ownerNames[i].equals(ownerName)) {
				double balance = balances[i];
				double newBalance = balance - withdrawalAndComission;

				if (balances[i] >= withdrawalAndComission) {
					System.out.println(ownerName + " " + withdrawal + " " + newBalance);
				} else {
					System.out.println(ownerName + " " + "NO");
				}
			}
		}
	}

	public static void main(String[] args) {
		takeMoneyOfExactOwner("Jane", 100);
		takeMoneyOfExactOwner("Ann", 235);
		takeMoneyOfExactOwner("Ann", 240);
		takeMoneyOfExactOwner("Jake", 100);
		takeMoneyOfExactOwner("Oww", 100);
		takeMoneyOfExactOwner("Lane", 100);
	}
}
