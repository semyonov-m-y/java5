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

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        int notEmpty = 0;
        for (int j = 0; j < users.length; j++) {
            if (users[j].getId() != 0 && users[j].getFirstName() != null && users[j].getLastName() != null
                    && users[j].getSalary() != 0 && users[j].getBalance() != 0 && users[j].getBalance() == balance) {
                notEmpty++;
            }
        }

        User[] usersWithConditionalBalance = new User[notEmpty];

        int count = 0;
        for (int m = 0; m < users.length; m++) {
            if (users[m].getId() != 0 && users[m].getFirstName() != null && users[m].getLastName() != null
                    && users[m].getSalary() != 0 && users[m].getBalance() != 0 && users[m].getBalance() == balance) {
                usersWithConditionalBalance[count] = users[m];
                count++;
            }
        }

        return usersWithConditionalBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (int k = 0; k < users.length; k++) {
            if (users[k].getSalary() > 0) {
                users[k].setBalance(users[k].getBalance() + users[k].getSalary());
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
        int notEmpty = 0;
        for (int m = 0; m < users.length; m++) {
            if (users[m].getId() != 0 && users[m].getFirstName() != null && users[m].getLastName() != null
                    && users[m].getSalary() != 0 && users[m].getBalance() != 0) {
                notEmpty++;
            }
        }

        User[] notEmptyUsers = new User[notEmpty];

        int count = 0;
        for (int m = 0; m < users.length; m++) {
            if (users[m].getId() != 0 && users[m].getFirstName() != null && users[m].getLastName() != null
                    && users[m].getSalary() != 0 && users[m].getBalance() != 0) {
                notEmptyUsers[count] = users[m];
                count++;
            }
        }

        return notEmptyUsers;
    }
}
