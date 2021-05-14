package ru.netology.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        User user = getUserByLoginPassword(login, password);
        validateAge(user);
        System.out.println("Access granted.");
    }

    private static void validateAge(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("You are under 18! Access denied.");
        }
    }

    private static User getUserByLoginPassword(String login, String password) throws UserNotFoundException {
        for (User user: getUsers()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
               return user;
            }
        }
        throw new UserNotFoundException("User is not found");
    }

    public static User[] getUsers() {
        User user1 = new User ("alena", "12345","alena@gmail.com", 35);
        User user2 = new User ("nata", "hello","nata@gmail.com", 21);
        User user3 = new User ("bob", "bob123","bob@gmail.com", 16);
        return new User[] {user1, user2, user3};
    }


}
