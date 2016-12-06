package main.java.javacore5.homework6;

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

        for (int m = 0; m < uniqueUsers.length; m++) {
            if (uniqueUsers[m] != null) {
                System.out.println(uniqueUsers[m]);
            }
        }

        return uniqueUsers;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        for (int j = 0; j < users.length; j++) {
            if (users[j].getBalance() == balance) {
                System.out.println(users[j].getFirstName() + " " + users[j].getLastName() + " " + users[j].getBalance());
            } else {
                System.out.println("User " + users[j].getFirstName() + " " + users[j].getLastName()
                        + " not with such balance.");
            }
        }

        return users;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (int k = 0; k < users.length; k++) {
            if (users[k].getSalary() > 0) {
                int userSalary = users[k].getSalary();
                userSalary = users[k].getBalance() + userSalary;
                System.out.println(users[k].getFirstName() + " " + users[k].getLastName() + " " + userSalary);
            }
        }

        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] id = new long[users.length];
        for (int l = 0; l < users.length; l++) {
            id[l] = users[l].getId();
            System.out.println(users[l].getFirstName() + " " + users[l].getLastName() + " " + users[l].getId());
        }

        return id;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        for (int m = 0; m < users.length; m++) {
            if (users[m].getFirstName().equals("") || users[m].getLastName().equals("")) {
                System.out.println("Deleted user is " + users[m].getId() + " " + users[m].getFirstName() + " "
                        + users[m].getLastName() + " " + users[m].getSalary() + " " + users[m].getBalance());
                users[m] = null;
            }
        }

        return users;
    }
}
