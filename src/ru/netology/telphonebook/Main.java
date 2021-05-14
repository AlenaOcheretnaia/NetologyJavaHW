package ru.netology.telphonebook;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        System.out.println("Program: Phone Book");

        PhoneBook myPhoneBook = new PhoneBook();

        createGroups(myPhoneBook);
        createContact(myPhoneBook);
        myPhoneBook.displayPhoneBook();

    }

    private static void createContact(PhoneBook myPhoneBook) {
        Scanner myScan = new Scanner(System.in);
        String inputContact, inputGroup;
        while (true) {
            System.out.println("Create contact (enter a name and number separated by a space) or enter 'no'?");
            inputContact = myScan.nextLine();
            if (inputContact.equals("no")) break;
            String[] contactInfo = inputContact.split(" ");
            Contact contact1;
            if (contactInfo.length == 2) {
                 contact1 = new Contact(contactInfo[0], contactInfo[1]);
            } else {
                System.out.println("!!! Please, enter name and number separated by space !!!");
                continue;
            }
            System.out.println("Specify contact groups separated by a space:");
            inputGroup = myScan.nextLine();
            String[] groups = inputGroup.split(" ");
            myPhoneBook.addContactToGroup(contact1, groups);
        }
    }

    private static void createGroups(PhoneBook myPhoneBook) {
        Scanner myScan = new Scanner(System.in);
        String inputGroup;
        while (true) {
            System.out.println("Create group (enter a name of the group) or enter 'no'?");
            inputGroup = myScan.nextLine();
            if (inputGroup.equals("no")) break;
            myPhoneBook.addGroup(inputGroup);
        }
    }


}
