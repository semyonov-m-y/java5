package javacore5.homework7;

import java.util.Comparator;

public class PriceCityComparator implements Comparator<Order> {

    public int compare(Order order1, Order order2) {
        if (order1.getPrice() == order2.getPrice()) {
            return order1.getUser().getCity().compareTo(order2.getUser().getCity());
        } else {
            return order1.getPrice() - order2.getPrice();
        }
    }
}
