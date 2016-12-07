package javacore5.homework4;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency,
                  int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee,
                rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (super.getCurrency() == Currency.USD) {
            withdrawal = 1000;
        } else if (super.getCurrency() == Currency.EUR) {
            withdrawal = 1200;
        }

        return withdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int funding = 0;
        if (super.getCurrency() == Currency.EUR) {
            funding = 10000;
        } else if (super.getCurrency() == Currency.USD) {
            funding = Integer.MAX_VALUE;
        }

        return funding;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 0;
        if (super.getCurrency() == Currency.USD) {
            rate = 1;
        } else if (super.getCurrency() == Currency.EUR) {
            rate = 2;
        }

        return rate;
    }

    @Override
    public int getCommission(int summ) {
        int commission = 0;
        if (super.getCurrency() == Currency.USD) {
            commission = summ <= 1000 ? 5 : 7;
        } else if (super.getCurrency() == Currency.EUR) {
            commission = summ <= 1000 ? 6 : 8;
        }

        return commission;
    }
}
