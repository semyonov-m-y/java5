package javacore5.homework6;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Max", "Semenov", 100000, 20000);
        User user2 = new User(2, "Alex", "Getmanov", 100000, 20000);
        User user3 = new User(3, "Max", "Semenov", 100000, 10000);
        User user4 = new User(1, "Max", "Semenov", 100000, 20000);
        User user5 = new User(1, "Max", "", 0, 20000);
        User user6 = new User(2, "Alex", "Getmanov", 100000, 20000);

        User[] users = new User[6];

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        users[5] = user6;

        UserUtils.uniqueUsers(users);
        UserUtils.usersWithConditionalBalance(users, 20000);
        UserUtils.paySalaryToUsers(users);
        UserUtils.getUsersId(users);
        UserUtils.deleteEmptyUsers(users);
    }
}
