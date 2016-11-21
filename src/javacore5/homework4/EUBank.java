package javacore5.homework4;

public class EUBank extends Bank  {

	public EUBank(long id, String bankCountry, Currency currency,
			int numberOfEmployees, double avrSalaryOfEmployee, long rating,
			long totalCapital) {
		super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee,
				rating, totalCapital);
	}

	@Override
	public int getLimitOfWithdrawal() {
		int withdrawal = 0;
			if (currency == Currency.USD) {
				withdrawal = 2000;
			} else if(currency == Currency.EUR) {
				withdrawal = 2200;
			}
		
		return withdrawal;
	}

	@Override
	public int getLimitOfFunding() {
		int funding = 0;
			if (currency == Currency.EUR) {
				funding = 20000;
			} else if (currency == Currency.USD) {
				funding = 10000;
			}
		
		return funding;
	}

	@Override
	public int getMonthlyRate() {
		int rate = 0;
			if (currency == Currency.USD) {
				rate = 0;
			} else if(currency == Currency.EUR) {
				rate = 1;
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
				commission = 2;
			} else if (currency == Currency.EUR && summ > 1000) {
				commission = 4;
			}
		
		return commission;
	}
}
