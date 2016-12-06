package javacore5.homework6;

public class UserUtils extends User {

    public UserUtils(long id, String firstName, String lastName, int salary, int balance) {
        super(id, firstName, lastName, salary, balance);
    }

    public static User[] uniqueUsers(User[] users) {
        User[] temp1 = new User[users.length];
        User[] temp2 = users.clone();
        User[] uniqueUsers = new User[users.length];

        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].equals(users[j])) {
                    temp2[j] = null;
                } else {
                    temp1[j] = users[j];
                }
            }
        }

        for (int k = 0; k < users.length; k++) {
            for (int l = k; l < temp2.length; l++) {
                if (temp2[k] != null && temp1[k] != null) {
                    if (users[k].equals(temp2[l])) {
                        // do nothing
                    } else {
                        uniqueUsers[l] = temp2[l];
                    }
                }
            }
        }

        return uniqueUsers;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] usersWithContitionalBalance = users.clone();
        for (int j = 0; j < users.length; j++) {
            if (users[j].getBalance() == balance) {
                usersWithContitionalBalance[j] = users[j];
            }
        }

        return usersWithContitionalBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (int k = 0; k < users.length; k++) {
            if (users[k].getSalary() > 0) {
                int userSalary = users[k].getSalary();
                int userBalance = users[k].getBalance() + userSalary;
            }
        }

        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        for (int l = 0; l < users.length; l++) {
            usersId[l] = users[l].getId();
        }

        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] noEmptyUsers = new User[users.length];
        for (int m = 0; m < noEmptyUsers.length; m++) {
            if (users[m].getLastName() == null) {
                // do nothing
            } else {
                noEmptyUsers[m] = users[m];
            }
        }

        return noEmptyUsers;
    }
}
