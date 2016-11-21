package javacore5.homework4;

public class BankSystemImpl implements BankSystem {

	@Override
	public void withdrawOfUser(User user, int amount) {
		System.out.print("������ �������� �������: ");
			if (amount > user.getBank().getLimitOfWithdrawal()) {
				System.out.println("�� ��������� ����� ������ �������� �������!");
				return;
			}
		
		user.setBalance(user.getBalance() - amount - (amount*user.getBank().getCommission(amount))/100);
		System.out.println("��� ������: " + user.getBalance());
	}

	@Override
	public void fundUser(User user, int amount) {
		System.out.print("�������� �������� �������: ");
			if (amount > user.getBank().getLimitOfFunding()) {
				System.out.println("�� ��������� ����� �������� �������� �������!");
				return;
			}
		
		user.setBalance(user.getBalance() + amount);
		System.out.println("��� ������: " + user.getBalance());
	}

	@Override
	public void transferMoney(User fromUser, User toUser, int amount) {
		System.out.print("������� �������� �������: ");
		fromUser.setBalance(fromUser.getBalance() - amount - (amount*fromUser.getBank().getCommission(amount))/100);
		toUser.setBalance(toUser.getBalance() + amount);
		System.out.println("��� ������: " + fromUser.getBalance());
	}

	@Override
	public void paySalary(User user) {
		System.out.print("���������� ���������� �����: ");
		user.setBalance(user.getBalance() + user.getSalary());
		System.out.println("��� ������: " + user.getBalance());
	}
}
