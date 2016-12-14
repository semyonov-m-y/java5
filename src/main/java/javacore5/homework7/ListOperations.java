package javacore5.homework7;

import java.util.Date;
import java.util.List;

public class ListOperations {

    public static List insertInt10000Times(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        return list;
    }

    public static List getInt10000Times(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return list;
    }

    public static List setInt10000Times(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "m");
        }

        return list;
    }

    public static List removeInt10000Times(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(list);
        }

        return list;
    }

    public static List insertString1000Times(List list) {
        for (int i = 0; i < 1000; i++) {
            list.add("k");
        }

        return list;
    }

    public static List getString1000Times(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        return list;
    }

    public static List setString1000Times(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, "m");
        }

        return list;
    }

    public static List removeString1000Times(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(list);
        }

        return list;
    }

    public static long getTimeNsOfInsert10000(List list) {
        Date addStartDate = new Date(System.nanoTime());

        insertInt10000Times(list);

        Date addEndtDate = new Date(System.nanoTime());
        long msDelay = addEndtDate.getTime() - addStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfInsert1000(List list) {
        Date addStartDate = new Date(System.nanoTime());

        insertString1000Times(list);

        Date addEndtDate = new Date(System.nanoTime());
        long msDelay = addEndtDate.getTime() - addStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfGet10000(List list) {
        Date getStartDate = new Date(System.nanoTime());

        getInt10000Times(list);

        Date getEndDate = new Date(System.nanoTime());
        long msDelay = getEndDate.getTime() - getStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfGet1000(List list) {
        Date getStartDate = new Date(System.nanoTime());

        getString1000Times(list);

        Date getEndDate = new Date(System.nanoTime());
        long msDelay = getEndDate.getTime() - getStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfSet10000(List list) {
        Date setStartDate = new Date(System.nanoTime());

        setInt10000Times(list);

        Date setEndDate = new Date(System.nanoTime());
        long msDelay = setEndDate.getTime() - setStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfSet1000(List list) {
        Date setStartDate = new Date(System.nanoTime());

        setString1000Times(list);

        Date setEndDate = new Date(System.nanoTime());
        long msDelay = setEndDate.getTime() - setStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfRemove10000(List list) {
        Date removeStartDate = new Date(System.nanoTime());

        removeInt10000Times(list);

        Date removeEndDate = new Date(System.nanoTime());
        long msDelay = removeEndDate.getTime() - removeStartDate.getTime();
        return msDelay;
    }

    public static long getTimeNsOfRemove1000(List list) {
        Date removeStartDate = new Date(System.nanoTime());

        removeString1000Times(list);

        Date removeEndDate = new Date(System.nanoTime());
        long msDelay = removeEndDate.getTime() - removeStartDate.getTime();
        return msDelay;
    }
}
