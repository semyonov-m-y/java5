package javacore5.homework9;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetOperations {

    public static List<Order> countPetrov(TreeSet<Order> set) {
        List<Order> user = set.stream().filter(p -> p.getUser().getLastName().contains("Petrov")).collect(Collectors.toList());
        return user;
    }

    public static TreeSet<Order> deleteUSD(TreeSet<Order> set) {
        set.removeIf(ourList -> ourList.getCurrency().equals(Currency.USD));

        return set;
    }
}