package javacore5.homework4;

public class USBank extends Bank {

	public USBank(long id, String bankCountry, Currency currency,
			int numberOfEmployees, double avrSalaryOfEmployee, long rating,
			long totalCapital) {
		super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee,
				rating, totalCapital);	
	}

	@Override
	public int getLimitOfWithdrawal() {
		int withdrawal = 0;
			if (currency == Currency.USD) {
				withdrawal = 1000;
			} else if(currency == Currency.EUR) {
				withdrawal = 1200;
			}

		return withdrawal;
	}

	@Override
	public int getLimitOfFunding() {
		int funding = 0;
			if (currency == Currency.EUR) {
				funding = 10000;
			} else if (currency == Currency.USD) {
				funding = Integer.MAX_VALUE;
			}
		
		return funding;
	}

	@Override
	public int getMonthlyRate() {
		int rate = 0;
			if (currency == Currency.USD) {
				rate = 1;
			} else if(currency == Currency.EUR) {
				rate = 2;
			}
		
		return rate;
	}

	@Override
	public int getCommission(int summ) {
		int commission = 0;
			if (currency == Currency.USD && summ <= 1000) {
				commission = 5;
			} else if (currency == Currency.USD && summ > 1000) {
				commission = 7;
			} else if (currency == Currency.EUR && summ <= 1000) {
				commission = 6;
			} else if (currency == Currency.EUR && summ > 1000) {
				commission = 8;
			}
		
		return commission;
	}
}
