package main.java.javacore5.homework4;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        System.out.print("Withdrawal of funds: ");
        if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("You exceeded the limit of cash withdrawal!");
            return;
        }

        user.setBalance((user.getBalance() - amount) - (amount * user.getBank().getCommission(amount)) / 100);
        System.out.println("Your balance:" + user.getBalance());
    }

    @Override
    public void fundUser(User user, int amount) {
        System.out.print("Adding funds: ");
        if (amount > user.getBank().getLimitOfFunding()) {
            System.out.println("You exceeded the limit of money adding!");
            return;
        }

        user.setBalance(user.getBalance() + amount);
        System.out.println("Your balance:" + user.getBalance());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.print("Money transfer: ");
        fromUser.setBalance((fromUser.getBalance() - amount) - (amount * fromUser.getBank().getCommission(amount)) / 100);
        toUser.setBalance(toUser.getBalance() + amount);
        System.out.println("Your balance:" + fromUser.getBalance());
    }

    @Override
    public void paySalary(User user) {
        System.out.print("Enrollment wages: ");
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("Your balance:" + user.getBalance());
    }
}
