package javacore5.homework2;

public class Task4 {

    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jake", "Oww", "Lane"};

    public static void putMoneyOfExactOwner(String ownerName, double fund) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                double balance = balances[i];
                double newBalance = balance + fund;

                System.out.println(ownerName + " " + newBalance);
            }
        }
    }

    public static void main(String[] args) {
        putMoneyOfExactOwner("Jane", 100);
        putMoneyOfExactOwner("Ann", 1000);
        putMoneyOfExactOwner("Jake", 100);
        putMoneyOfExactOwner("Oww", 100);
        putMoneyOfExactOwner("Lane", 100);
    }
}
