package javacore5.homework7;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {

    private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private static LinkedList<Integer> linkedList = new LinkedList<Integer>();
    private static ArrayList<String> arrayList1 = new ArrayList<String>();
    private static LinkedList<String> linkedList1 = new LinkedList<String>();

    public static void main(String[] args) {
        ListOperations.insertIntManyTimes(arrayList);
        ListOperations.getIntManyTimes(arrayList);
        ListOperations.setIntManyTimes(arrayList);
        ListOperations.removeIntManyTimes(arrayList);

        ListOperations.insertIntManyTimes(linkedList);
        ListOperations.getIntManyTimes(linkedList);
        ListOperations.setIntManyTimes(linkedList);
        ListOperations.removeIntManyTimes(linkedList);

        ListOperations.insertStringManyTimes(arrayList1);
        ListOperations.getStringManyTimes(arrayList1);
        ListOperations.setStringManyTimes(arrayList1);
        ListOperations.removeStringManyTimes(arrayList1);

        ListOperations.insertStringManyTimes(linkedList1);
        ListOperations.getStringManyTimes(linkedList1);
        ListOperations.setStringManyTimes(linkedList1);
        ListOperations.removeStringManyTimes(linkedList1);

        System.out.println(ListOperations.getTimeNsOfInsert(ListOperations
                .insertIntManyTimes(new ArrayList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfInsert(ListOperations
                .insertIntManyTimes(new LinkedList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfInsert(ListOperations
                .insertStringManyTimes(new ArrayList<String>())));
        System.out.println(ListOperations.getTimeNsOfInsert(ListOperations
                .insertStringManyTimes(new LinkedList<String>())));
        System.out.println(ListOperations.getTimeNsOfGet(ListOperations
                .getIntManyTimes(new ArrayList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfGet(ListOperations
                .getIntManyTimes(new LinkedList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfGet(ListOperations
                .getStringManyTimes(new ArrayList<String>())));
        System.out.println(ListOperations.getTimeNsOfGet(ListOperations
                .getStringManyTimes(new LinkedList<String>())));
        System.out.println(ListOperations.getTimeNsOfSet(ListOperations
                .setIntManyTimes(new ArrayList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfSet(ListOperations
                .setIntManyTimes(new LinkedList<Integer>())));
        System.out.println(ListOperations.getTimeNsOfSet(ListOperations
                .setStringManyTimes(new ArrayList<String>())));
        System.out.println(ListOperations.getTimeNsOfSet(ListOperations
                .setStringManyTimes(new LinkedList<String>())));
        System.out.println(ListOperations.getTimeNsOfRemove(ListOperations
                .removeIntManyTimes(new ArrayList())));
        System.out.println(ListOperations.getTimeNsOfRemove(ListOperations
                .removeIntManyTimes(new LinkedList())));
        System.out.println(ListOperations.getTimeNsOfRemove(ListOperations
                .removeStringManyTimes(new ArrayList())));
        System.out.println(ListOperations.getTimeNsOfRemove(ListOperations
                .removeStringManyTimes(new LinkedList())));
    }

    public static int doHowManyTimes(List list) {
        int timesCounter = 0;
        if (list.equals(arrayList) || list.equals("linkedList")) {
            timesCounter = 10000;
        } else if (list.equals("arrayList1")  || list.equals("linkedList1")) {
            timesCounter = 1000;
        }

        return timesCounter;
    }

    public static List insertIntManyTimes(List list) {
        for (int i = 0; i < doHowManyTimes(list); i++) {
            list.add(i);
        }

        return list;
    }

    public static List getIntManyTimes(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return list;
    }

    public static List setIntManyTimes(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "m");
        }

        return list;
    }

    public static List removeIntManyTimes(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(list);
        }

        return list;
    }

    public static List insertStringManyTimes(List list) {
        for (int i = 0; i < doHowManyTimes(list); i++) {
            list.add("k");
        }

        return list;
    }

    public static List getStringManyTimes(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return list;
    }

    public static List setStringManyTimes(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "m");
        }

        return list;
    }

    public static List removeStringManyTimes(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(list);
        }

        return list;
    }

    public static long getTimeNsOfInsert(List list) {
        Date addStartDate = new Date(System.nanoTime());

        insertIntManyTimes(list);

        Date addEndtDate = new Date(System.nanoTime());
        long nsDelay = addEndtDate.getTime() - addStartDate.getTime();
        return nsDelay;
    }

    public static long getTimeNsOfGet(List list) {
        Date getStartDate = new Date(System.nanoTime());

        getIntManyTimes(list);

        Date getEndDate = new Date(System.nanoTime());
        long nsDelay = getEndDate.getTime() - getStartDate.getTime();
        return nsDelay;
    }

    public static long getTimeNsOfSet(List list) {
        Date setStartDate = new Date(System.nanoTime());

        setIntManyTimes(list);

        Date setEndDate = new Date(System.nanoTime());
        long nsDelay = setEndDate.getTime() - setStartDate.getTime();
        return nsDelay;
    }

    public static long getTimeNsOfRemove(List list) {
        Date removeStartDate = new Date(System.nanoTime());

        removeIntManyTimes(list);

        Date removeEndDate = new Date(System.nanoTime());
        long nsDelay = removeEndDate.getTime() - removeStartDate.getTime();
        return nsDelay;
    }
}

