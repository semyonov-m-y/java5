package main.java.homeworks.homework7;

import java.util.Iterator;
import java.util.TreeSet;

public class SetOperations {

    public static int MAX = Integer.MIN_VALUE;

    public static int countPetrov(TreeSet set) {
        int setCount = 0;
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            Order ourSet = iterator.next();
            if (ourSet.getUser().getLastName().equals("Petrov")) {
                setCount++;
            }
        }

        return setCount;
    }

    public static int findMaxPrice(TreeSet set) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            Order ourSet = iterator.next();
            if (ourSet.getPrice() > MAX) {
                MAX = ourSet.getPrice();
            }
        }

        return MAX;
    }

    public static TreeSet deleteUSD(TreeSet set) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
            Order ourSet = iterator.next();
            if (ourSet.getCurrency().equals(Currency.USD)) {
                iterator.remove();
            }
        }

        return set;
    }
}
