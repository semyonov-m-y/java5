package javacore5.homework9;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetOperations {

    public static List<Order> countPetrov(TreeSet<Order> set) {
        return set.stream().filter(order -> order.getUser().getLastName().contains("Petrov")).collect(Collectors.toList());
    }

    public static TreeSet<Order> deleteUSD(TreeSet<Order> set) {
        set.removeIf(user -> user.getCurrency().equals(Currency.USD));
        return set;
    }
}
