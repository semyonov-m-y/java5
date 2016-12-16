package main.java.homeworks.homework7;

import java.util.*;

import main.java.homeworks.homework7.rooms.RoomsMain;

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

        /*ArrayList<Order> list2 = new ArrayList<>();
        ArrayList<Order> list3 = new ArrayList<>();*/

        ListOfOrders.divideOnTwo(list/*, list2, list3*/);
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

        RoomsMain.saveDeleteRooms();
    }
}

