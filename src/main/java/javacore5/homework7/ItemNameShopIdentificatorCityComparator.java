package javacore5.homework7;

import java.util.Comparator;

public class ItemNameShopIdentificatorCityComparator implements Comparator<Order> {

    public int compare(Order order1, Order order2) {
        if (order1.getItemName().compareTo(order2.getItemName()) == 0) {
            if (order1.getShopIdentificator().compareTo(order2.getShopIdentificator()) == 0) {
                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            } else {
                return order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
            }
        } else {
            return order1.getItemName().compareTo(order2.getItemName());
        }
    }
}
