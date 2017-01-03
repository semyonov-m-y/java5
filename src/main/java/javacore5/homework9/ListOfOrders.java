package javacore5.homework9;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfOrders {

    public static List<Order> listPriceSort(List<Order> list) {
        list.sort((order1, order2) -> order2.getPrice() - order1.getPrice());
        return list;
    }

    public static List<Order> listPriceCitySort(List<Order> list) {
        list.sort(Comparator.comparing(Order::getPrice).thenComparing((order1, order2) -> order1
                .getUser().getCity().compareTo(order2.getUser().getCity())));
        return list;
    }

    public static List<Order> itemNameShopIdentificatorCitySort(List<Order> list) {
        list.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator)
                .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        return list;
    }

    public static List<Order> deleteEqual(List<Order> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<Order> deleteLessThan1500(List<Order> list) {
        list.removeIf(order -> order.getPrice() < 1500);
        return list;
    }

    public static Map<Currency, List<Order>> divideOnTwo(List<Order> list) {
        return list.stream().collect(Collectors.groupingBy((order) -> (order.getCurrency())));
    }

    public static Map<String, List<Order>> divideWithUniqueCity(List<Order> list) {
        return list.stream().collect(Collectors.groupingBy((order) -> (order.getUser().getCity())));
    }
}
