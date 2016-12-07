package javacore5.homework4;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency,
                     int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee,
                rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (super.getCurrency() == Currency.USD) {
            withdrawal = 100;
        } else if(super.getCurrency() == Currency.EUR) {
            withdrawal = 150;
        }

        return withdrawal;
    }

    @Override
    public int getLimitOfFunding() {
        int funding = 0;
        if (super.getCurrency() == Currency.EUR) {
            funding = 5000;
        } else if (super.getCurrency() == Currency.USD) {
            funding = 10000;
        }

        return funding;
    }

    @Override
    public int getMonthlyRate() {
        int rate = 0;
        if (super.getCurrency() == Currency.USD) {
            rate = 1;
        } else if(super.getCurrency() == Currency.EUR) {
            rate = 0;
        }

        return rate;
    }

    @Override
    public int getCommission(int summ) {
        int commission = 0;
        if (getCurrency() == Currency.USD ) {
            commission = summ <= 1000 ? 3 : 5;
        }

        if (getCurrency() == Currency.EUR) {
            commission = summ <= 1000 ? 10 : 11;
        }

        return commission;
    }
}
