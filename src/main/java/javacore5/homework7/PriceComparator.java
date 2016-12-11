package javacore5.homework7;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order> {

    public int compare(Order order1, Order order2) {
        return order2.getPrice() - order1.getPrice();
    }
}
