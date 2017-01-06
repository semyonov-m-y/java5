package javacore5.homework9;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfOrders {

    public static List<Order> listPriceSort(List<Order> list) {
        return list.stream().sorted(Comparator.comparing(Order::getPrice).reversed()).collect(Collectors.toList());
    }

    public static List<Order> listPriceCitySort(List<Order> list) {
        return list.stream().sorted(Comparator.comparing(Order::getPrice).thenComparing((order1, order2) -> order1
                .getUser().getCity().compareTo(order2.getUser().getCity()))).collect(Collectors.toList());
    }

    public static List<Order> listItemNameShopIdentificatorCitySort(List<Order> list) {
        return list.stream().sorted(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator)
                .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())))
                .collect(Collectors.toList());
    }

    public static List<Order> deleteEqual(List<Order> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<Order> deleteLessThan1500(List<Order> list) {
        return list.stream().filter(order -> order.getPrice() >= 1500).collect(Collectors.toList());
    }

    public static Map<Currency, List<Order>> divideOnTwo(List<Order> list) {
        return list.stream().collect(Collectors.groupingBy((order) -> (order.getCurrency())));
    }

    public static Map<String, List<Order>> divideWithUniqueCity(List<Order> list) {
        return list.stream().collect(Collectors.groupingBy((order) -> (order.getUser().getCity())));
    }
}
