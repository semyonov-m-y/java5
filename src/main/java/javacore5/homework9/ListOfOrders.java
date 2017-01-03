package javacore5.homework9;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfOrders {

    public static List<Order> listPriceSort(List<Order> list) {
        list.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
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
        list = list.stream().distinct().collect(Collectors.toList());
        return list;
    }

    public static List deleteLessThan1500(List<Order> list) {
        list.removeIf(order -> order.getPrice() < 1500);
        return list;
    }

    public static Map<Currency, List<Order>> divideOnTwo(List<Order> list) {
        Map<Currency, List<Order>> ordersByCurrency = list.stream()
                .collect(Collectors.groupingBy((order) -> (order.getCurrency())));
        return ordersByCurrency;
    }

    public static Map<String, List<Order>> divideWithUniqueCity(List<Order> list) {
        Map<String, List<Order>> ordersByCity = list.stream()
                .collect(Collectors.groupingBy((order) -> (order.getUser().getCity())));
        return ordersByCity;
    }
}