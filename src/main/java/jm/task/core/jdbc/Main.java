package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("A", "Aa", (byte) 78);
        userService.saveUser("B", "Bb", (byte) 74);
        userService.saveUser("C", "Cc", (byte) 59);
        userService.saveUser("D", "Dd", (byte) 74);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
