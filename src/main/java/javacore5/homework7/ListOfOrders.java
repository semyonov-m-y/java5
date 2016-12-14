package javacore5.homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfOrders {

    @SuppressWarnings("unchecked")
    public static List listPriceSort(List list) {
        Collections.sort(list, new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                return order2.getPrice() - order1.getPrice();
            }
        });

        return list;
    }

    @SuppressWarnings("unchecked")
    public static List listPriceCitySort(List list) {
        list.sort(Comparator.comparing(Order::getPrice).thenComparing((order1, order2)
            -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));

        return list;
    }

    @SuppressWarnings("unchecked")
    public static List itemNameShopIdentificatorCitySort(List list) {
        list.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator)
            .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        return list;
    }

    public static List deleteEqual(List list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }

        return list;
    }

    public static List deleteLessThan1500(List list) {
        for (int m = 0; m < list.size(); m++) {
            if (((Order) list.get(m)).getPrice() < 1500) {
                list.remove(m);
            }
        }

        return list;
    }

    public static void divideOnTwo(List list, List list1, List list2) {
        for (int m = 0; m < list.size(); m++) {
            if (((Order) list.get(m)).getCurrency() == Currency.USD) {
                list1.add(list.get(m));
            } else if (((Order) list.get(m)).getCurrency() == Currency.UAH) {
                list2.add(list.get(m));
            }
        }

        System.out.println(list1);
        System.out.println(list2);
    }

    public static List divideWithUniqueCity(List list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (((Order) list.get(i)).getUser().getCity().equals(((Order) list.get(j)).getUser().getCity())) {
                    list.remove(j);
                }
            }
        }

        ArrayList<List> list1 = new ArrayList<>();

        for (int l = 0; l < list.size(); l++) {
            list1.add(new ArrayList<>());
        }

        for (int l = 0; l < list.size(); l++) {
            list1.get(l).add(list.get(l));
        }

        return list1;
    }
}
