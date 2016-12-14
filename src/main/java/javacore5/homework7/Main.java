package javacore5.homework7;

import java.util.*;

public class Main {

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

        System.out.println(ListOfOrders.listPriceSort(list));
        System.out.println("");
        System.out.println(ListOfOrders.listPriceCitySort(list));
        System.out.println("");
        System.out.println(ListOfOrders.itemNameShopIdentificatorCitySort(list));
        System.out.println("");
        System.out.println(ListOfOrders.deleteEqual(list));
        System.out.println("");
        System.out.println(ListOfOrders.deleteLessThan1500(list));
        System.out.println("");

        ArrayList<Order> list2 = new ArrayList<>();
        ArrayList<Order> list3 = new ArrayList<>();

        ListOfOrders.divideOnTwo(list, list2, list3);
        System.out.println("");

        System.out.println(ListOfOrders.divideWithUniqueCity(list));
        System.out.println("");

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

        System.out.println(SetOperations.countPetrov(set));
        System.out.println("");
        System.out.println(SetOperations.findMaxPrice(set));
        System.out.println("");
        System.out.println(SetOperations.deleteUSD(set));
        System.out.println("");

        Controller controller = new Controller();

        controller.requestRooms(1000, 1, "Landmark", "New York");
        controller.requestRooms(2000, 2, "Arlington", "Jackson");

        for (Room oneRoom : controller.requestRooms(1000, 1, "Landmark", "New York")) {
            System.out.println(oneRoom.getId());
        }

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();

        controller.check(api1, api2);

        Room room1 = new Room(3, 5000, 1, new Date(), "hotel", "city");
        DAO dao = new DAOImpl();

        dao.save(room1);
        dao.delete(room1);
        System.out.println("");

        // ArrayList10000
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ListOperations.insertInt10000Times(arrayList);
        ListOperations.getInt10000Times(arrayList);
        ListOperations.setInt10000Times(arrayList);
        ListOperations.removeInt10000Times(arrayList);

        // LinkedList10000
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ListOperations.insertInt10000Times(linkedList);
        ListOperations.getInt10000Times(linkedList);
        ListOperations.setInt10000Times(linkedList);
        ListOperations.removeInt10000Times(linkedList);

        // ArrayList1000
        ArrayList<String> arrayList1 = new ArrayList<String>();
        ListOperations.insertString1000Times(arrayList1);
        ListOperations.getString1000Times(arrayList1);
        ListOperations.setString1000Times(arrayList1);
        ListOperations.removeString1000Times(arrayList1);

        // LinkedList1000
        LinkedList<String> linkedList1 = new LinkedList<String>();
        ListOperations.insertString1000Times(linkedList1);
        ListOperations.getString1000Times(linkedList1);
        ListOperations.setString1000Times(linkedList1);
        ListOperations.removeString1000Times(linkedList1);

        System.out.println(ListOperations.getTimeNsOfInsert10000(ListOperations
                .insertInt10000Times(new ArrayList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfInsert10000(ListOperations
                .insertInt10000Times(new LinkedList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfInsert1000(ListOperations
                .insertString1000Times(new ArrayList<String>())));
        System.out.println(ListOperations.getTimeNsOfInsert1000(ListOperations
                .insertString1000Times(new LinkedList<String>())));
        System.out.println(ListOperations.getTimeNsOfGet10000(ListOperations
                .getInt10000Times(new ArrayList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfGet10000(ListOperations
                .getInt10000Times(new LinkedList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfGet1000(ListOperations
                .getString1000Times(new ArrayList<String>())));
        System.out.println(ListOperations.getTimeNsOfGet1000(ListOperations
                .getString1000Times(new LinkedList<String>())));
        System.out.println(ListOperations.getTimeNsOfSet10000(ListOperations
                .setInt10000Times(new ArrayList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfSet10000(ListOperations
                .setInt10000Times(new LinkedList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfSet1000(ListOperations
                .setString1000Times(new ArrayList<String>())));
        System.out.println(ListOperations.getTimeNsOfSet1000(ListOperations
                .setString1000Times(new LinkedList<String>())));
        System.out.println(ListOperations.getTimeNsOfRemove10000(ListOperations
                .removeInt10000Times(new ArrayList())));
        System.out.println(ListOperations.getTimeNsOfRemove10000(ListOperations
                .removeInt10000Times(new LinkedList())));
        System.out.println(ListOperations.getTimeNsOfRemove1000(ListOperations
                .removeString1000Times(new ArrayList())));
        System.out.println(ListOperations.getTimeNsOfRemove1000(ListOperations
                .removeString1000Times(new LinkedList())));
    }
}

