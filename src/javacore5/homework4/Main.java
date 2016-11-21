package javacore5.homework4;

public class Main extends BankSystemImpl {

	public static void main(String[] args) {
		BankSystemImpl bsImpl = new BankSystemImpl();
		
		Bank usBank1 = new USBank(0l, "USA", Bank.Currency.EUR, 100, 7000.0, 13l, 0l);
		User user1 = new User(10l, "Max", 100000.0, 9, "SBT", 100000, usBank1);
		
		Bank usBank2 = new USBank(1, "USA", Bank.Currency.USD, 1000, 6000.0, 13l, 0l);
		User user2 = new User(11l, "Alex", 100000.0, 10, "Diksi", 100000, usBank2);
		
		Bank euBank1 = new EUBank(2, "Germany", Bank.Currency.EUR, 100, 5000.0, 13l, 0l);
		User user3 = new User(12l, "Anna", 100000.0, 11, "Sberbank", 100000, euBank1);
		
		Bank euBank2 = new EUBank(3, "France", Bank.Currency.USD, 1000, 4000.0, 13l, 0l);
		User user4 = new User(1l, "Elena", 100000.0, 12, "Luxoft", 100000, euBank2);
		
		Bank chinaBank1 = new ChinaBank(4, "China", Bank.Currency.EUR, 100, 3000.0, 13l, 0l);
		User user5 = new User(2l, "Bob", 100000.0, 1, "Applana", 100000, chinaBank1);
		
		Bank chinaBank2 = new ChinaBank(5, "China", Bank.Currency.USD, 1000, 2000.0, 13l, 0l);
		User user6 = new User(3l, "Piter", 100000.0, 2, "5_Seasons", 100000, chinaBank2);

		bsImpl.withdrawOfUser(user1, 1000);
		bsImpl.withdrawOfUser(user2, 900);
		bsImpl.withdrawOfUser(user3, 2201);
		bsImpl.withdrawOfUser(user4, 2000);
		bsImpl.withdrawOfUser(user5, 5000);
		bsImpl.withdrawOfUser(user6, 100);
		
		System.out.println("");
		
		bsImpl.fundUser(user1, 100);
		bsImpl.fundUser(user2, 1000);
		bsImpl.fundUser(user3, 10000);
		bsImpl.fundUser(user4, 14000);
		bsImpl.fundUser(user5, 5000);
		bsImpl.fundUser(user6, 10000);
		
		System.out.println("");
			
		bsImpl.transferMoney(user1, user3, 100);
		bsImpl.transferMoney(user2, user4, 1000);
		bsImpl.transferMoney(user3, user5, 3000);
		bsImpl.transferMoney(user4, user6, 4000);
		bsImpl.transferMoney(user5, user1, 5000);
		bsImpl.transferMoney(user6, user2, 10000);
		
		System.out.println("");
		
		bsImpl.paySalary(user1);
		bsImpl.paySalary(user2);
		bsImpl.paySalary(user3);
		bsImpl.paySalary(user4);
		bsImpl.paySalary(user5);
		bsImpl.paySalary(user6);
	}
}
