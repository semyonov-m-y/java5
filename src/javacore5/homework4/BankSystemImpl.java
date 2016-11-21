package javacore5.homework4;

public class BankSystemImpl implements BankSystem {

	@Override
	public void withdrawOfUser(User user, int amount) {
		System.out.print("Выдача денежных средств: ");
			if (amount > user.getBank().getLimitOfWithdrawal()) {
				System.out.println("Вы привысили лимит снятия денежных средств!");
				return;
			}
		
		user.setBalance(user.getBalance() - amount - (amount*user.getBank().getCommission(amount))/100);
		System.out.println("Ваш баланс: " + user.getBalance());
	}

	@Override
	public void fundUser(User user, int amount) {
		System.out.print("Внесение денежных средств: ");
			if (amount > user.getBank().getLimitOfFunding()) {
				System.out.println("Вы привысили лимит внесения денежных средств!");
				return;
			}
		
		user.setBalance(user.getBalance() + amount);
		System.out.println("Ваш баланс: " + user.getBalance());
	}

	@Override
	public void transferMoney(User fromUser, User toUser, int amount) {
		System.out.print("Перевод денежных средств: ");
		fromUser.setBalance(fromUser.getBalance() - amount - (amount*fromUser.getBank().getCommission(amount))/100);
		toUser.setBalance(toUser.getBalance() + amount);
		System.out.println("Ваш баланс: " + fromUser.getBalance());
	}

	@Override
	public void paySalary(User user) {
		System.out.print("Зачисление заработной платы: ");
		user.setBalance(user.getBalance() + user.getSalary());
		System.out.println("Ваш баланс: " + user.getBalance());
	}
}
