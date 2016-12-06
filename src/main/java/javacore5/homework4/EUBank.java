package main.java.javacore5.homework4;

public class EUBank extends Bank {

    private Currency currency;

    public EUBank(long id, String bankCountry, Currency currency,
                  int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee,
                rating, totalCapital);
        this.currency = currency;
    }

    @Override
    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (currency == Currency.USD) {
            withdrawal = 2000;
        } else if (currency == Currency.EUR) {
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
        } else if (currency == Currency.EUR) {
            rate = 1;
        }

        return rate;
    }

    @Override
    public int getCommission(int summ) {
        int commission = 0;
        if (currency == Currency.USD) {
            commission = summ <= 1000 ? 5 : 7;
        }

        if (currency == Currency.EUR) {
            commission = summ <= 1000 ? 2 : 4;
        }

        return commission;
    }
}
