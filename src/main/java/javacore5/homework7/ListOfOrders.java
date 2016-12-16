package javacore5.homework7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        list.sort(Comparator.comparing(Order::getPrice).thenComparing((order1, order2) -> order1
            .getUser().getCity().compareTo(order2.getUser().getCity())));

        return list;
    }

    @SuppressWarnings("unchecked")
    public static List itemNameShopIdentificatorCitySort(List list) {
        list.sort(Comparator.comparing(Order::getItemName).thenComparing(Order::getShopIdentificator)
            .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        return list;
    }

    public static List deleteEqual(List list) {
        List<List> listWithoutDuplicates = Arrays.asList(list);
        Stream<Order> ll = list.stream();
        ll.distinct().collect(Collectors.toList());
    	/*Collection<List> collection = Arrays.asList(list);
    	collection.stream().filter("list"::equals).count();
    	collection.stream().distinct().collect(Collectors.toList());*/
        /*for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }*/

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

    public static Map<Object, List<Order>> divideOnTwo(List list/*, List list1, List list2*/) {
    	List<Order> ordersList = new ArrayList<>();
    	Map<Object, List<Order>> ordersByCurrency =  ordersList.stream().collect(Collectors.groupingBy((order) -> ((Order) order).getCurrency()));
    	/*Map<String, List<Order>> map = new HashMap();
    	 for (int m = 0; m < list.size(); m++) {
    	    	map.put(list.get(m), list);
         }

    	if ()*/
        /*for (int m = 0; m < list.size(); m++) {
            if (((Order) list.get(m)).getCurrency() == Currency.USD) {
                list1.add(list.get(m));
            } else if (((Order) list.get(m)).getCurrency() == Currency.UAH) {
                list2.add(list.get(m));
            }
        }

        System.out.println(list1);
        System.out.println(list2);*/
    	return ordersByCurrency;
    }

    public static List divideWithUniqueCity(List list) {
    	List<Order> ordersList = new ArrayList<>();
    	Map<Object, List<Order>> ordersByCity =  ordersList.stream().collect(Collectors.groupingBy((order) -> ((Order) order).getUser().getCity()));
       /* for (int i = 0; i < list.size(); i++) {
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

        return list1;*/
		return ordersList;
    }
}
