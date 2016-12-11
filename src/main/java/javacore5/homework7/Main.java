package javacore5.homework7;

import java.util.*;

public class Main {

    public static int MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        User user1 = new User(1, "Max", "Semenov", "Moscow", 100000);
        User user3 = new User(3, "Ruslan", "Baybekov", "Lobnya", 80000);
        User user4 = new User(4, "Slava", "Gonchar", "Astrahan", 70000);
        User user5 = new User(5, "Daria", "Beketova", "Himki", 60000);
        User user6 = new User(6, "Alex", "Chuprunov", "Himki", 50000);
        User user7 = new User(7, "Vlad", "Zlatikh", "London", 40000);
        User user8 = new User(8, "Yriy", "Petrov", "Novosibirsk", 30000);
        User user9 = new User(9, "Anna", "Fedorova", "Omsk", 20000);
        User user10 = new User(10, "Alex", "Hilnichenko", "Vladivostok", 10000);

        Order order1 = new Order(1, 10000, Currency.UAH, "Toy", "BayBoom", user1);
        Order order2 = new Order(3, 2000, Currency.USD, "Food", "5Seasons", user3);
        Order order3 = new Order(3, 2000, Currency.USD, "Food", "5Seasons", user3);
        Order order4 = new Order(4, 2000, Currency.UAH, "Toy", "4Kids", user4);
        Order order5 = new Order(5, 10000, Currency.USD, "Car", "Kia", user5);
        Order order6 = new Order(6, 1000000, Currency.UAH, "Car", "BMV", user6);
        Order order7 = new Order(7, 1000, Currency.USD, "Computers", "NETA", user7);
        Order order8 = new Order(8, 2000, Currency.USD, "Computers", "RStyle", user8);
        Order order9 = new Order(9, 3000, Currency.UAH, "Bags", "H&M", user9);
        Order order10 = new Order(10, 4000, Currency.USD, "Bags", "Dior", user10);

        ArrayList<Order> list = new ArrayList<>();
        list.add(order2);
        list.add(order1);
        list.add(order3);
        list.add(order4);
        list.add(order6);
        list.add(order5);
        list.add(order7);
        list.add(order9);
        list.add(order8);
        list.add(order10);

        Collections.sort(list, new PriceComparator());

        Collections.sort(list, new PriceCityComparator());

        Collections.sort(list, new ItemNameShopIdentificatorCityComparator());

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }

        for (int m = 0; m < list.size(); m++) {
            if (list.get(m).getPrice() < 1500) {
                list.remove(m);
            }
        }

        ArrayList<Order> list2 = new ArrayList<>();
        ArrayList<Order> list3 = new ArrayList<>();

        for (int m = 0; m < list.size(); m++) {
            if (list.get(m).getCurrency() == Currency.USD) {
                list2.add(list.get(m));
            } else if (list.get(m).getCurrency() == Currency.UAH) {
                list3.add(list.get(m));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getUser().getCity().equals(list.get(j).getUser().getCity())) {
                    list.remove(j);
                }
            }
        }

        ArrayList<List> list4 = new ArrayList<>();

        for (int l = 0; l < list.size(); l++) {
            list4.add(new ArrayList<>());
        }

        User user11 = new User(1, "Max", "Semenov", "Moscow", 100000);
        User user13 = new User(3, "Ruslan", "Baybekov", "Lobnya", 80000);
        User user14 = new User(4, "Slava", "Gonchar", "Lobnya", 70000);
        User user15 = new User(5, "Daria", "Beketova", "Himki", 60000);
        User user16 = new User(6, "Alex", "Chuprunov", "Himki", 50000);
        User user17 = new User(7, "Vlad", "Zlatikh", "Moscow", 40000);
        User user18 = new User(8, "Yriy", "Petrov", "Novosibirsk", 30000);
        User user19 = new User(9, "Anna", "Fedorova", "Omsk", 20000);
        User user20 = new User(10, "Alex", "Hilnichenko", "Vladivostok", 10000);

        Order order11 = new Order(1, 10000, Currency.UAH, "Toy", "BayBoom", user11);
        Order order12 = new Order(1, 10000, Currency.UAH, "Toy", "BayBoom", user11);
        Order order13 = new Order(3, 2000, Currency.USD, "Food", "5Seasons", user13);
        Order order14 = new Order(4, 2000, Currency.UAH, "Toy", "4Kids", user14);
        Order order15 = new Order(5, 100000, Currency.USD, "Car", "Kia", user15);
        Order order16 = new Order(6, 1000000, Currency.UAH, "Car", "BMV", user16);
        Order order17 = new Order(7, 1000, Currency.USD, "Computers", "NETA", user17);
        Order order18 = new Order(8, 2000, Currency.USD, "Computers", "RStyle", user18);
        Order order19 = new Order(9, 3000, Currency.UAH, "Bags", "H&M", user19);
        Order order20 = new Order(10, 4000, Currency.USD, "Bags", "Dior", user20);

        TreeSet<Order> set = new TreeSet<>();
        set.add(order11);
        set.add(order12);
        set.add(order13);
        set.add(order14);
        set.add(order15);
        set.add(order16);
        set.add(order17);
        set.add(order18);
        set.add(order19);
        set.add(order20);

        int setCount = 0;
        Iterator<Order> iterator = set.iterator();

        while (iterator.hasNext()) {
            Order ourSet = iterator.next();
            if (ourSet.getUser().getLastName().equals("Petrov")) {
                setCount++;
            }
        }

        Iterator<Order> iterator1 = set.iterator();

        while (iterator1.hasNext()) {
            Order ourSet1 = iterator1.next();
            if (ourSet1.getPrice() > MAX) {
                MAX = ourSet1.getPrice();
            }
        }

        Iterator<Order> iterator2 = set.iterator();

        while (iterator2.hasNext()) {
            Order ourSet1 = iterator2.next();
            if (ourSet1.getCurrency().equals(Currency.USD)) {
                iterator2.remove();
            }
        }

        // ArrayList10000
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList10000
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);

        // ArrayList1000
        ArrayList<String> arrayList1 = new ArrayList<String>();
        insert1000(arrayList1);
        get1000(arrayList1);
        set1000(arrayList1);
        remove1000(arrayList1);

        // LinkedList1000
        LinkedList<String> linkedList1 = new LinkedList<String>();
        insert1000(linkedList1);
        get1000(linkedList1);
        set1000(linkedList1);
        remove1000(linkedList1);
    }

    public static List insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        return list;
    }

    public static List get10000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return list;
    }

    public static List set10000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "m");
        }

        return list;
    }

    public static List remove10000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(list);
        }

        return list;
    }

    public static List insert1000(List list) {
        for (int i = 0; i < 1000; i++) {
            list.add("k");
        }

        return list;
    }

    public static List get1000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return list;
    }

    public static List set1000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "m");
        }

        return list;
    }

    public static List remove1000(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(list);
        }

        return list;
    }

    public static long getTimeMsOfInsert10000(List list) {
        Date date = new Date();

        insert10000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfInsert1000(List list) {
        Date date = new Date();

        insert1000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfGet10000(List list) {
        Date date = new Date();

        get10000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfGet1000(List list) {
        Date date = new Date();

        get1000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfSet10000(List list) {
        Date date = new Date();

        set10000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfSet1000(List list) {
        Date date = new Date();

        set1000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfRemove10000(List list) {
        Date date = new Date();

        remove10000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }

    public static long getTimeMsOfRemove1000(List list) {
        Date date = new Date();

        remove1000(list);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date1 = new Date();
        long msDelay = date1.getTime() - date.getTime();
        return msDelay;
    }
}

