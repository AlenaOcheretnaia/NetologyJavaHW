package ru.netology.phonemissedcalls;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PhoneContacts myPhoneContacts = new PhoneContacts();
        MissedCalls myMissedCalls = new MissedCalls();

        Scanner myScan = new Scanner(System.in);
        String input, inputContact;

        while (true) {
            System.out.println("----Select action or '0'/enter for exit-----:\n1. Add Contact\n2. Add missed call\n" +
                    "3. Display Missed calls\n4. Clear Missed calls\n5. Delete Contact by Name and Surname\n0. Exit");
            input = myScan.nextLine();
//    0. Завершить работу программы (выход).
            if (input.equals("0") || input.equals("")) break;
            int caseNum = Integer.parseInt(input);
            switch (caseNum) {
//    1. Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья).
                case 1:
                    System.out.println("Enter Contact info: Name Surname PhoneNumber Group(FAMILY/WORK/FRIENDS) (separated by space):");
                    inputContact = myScan.nextLine();
                    String[] contactInfo = inputContact.split(" ");
                    Contact contact1;
                    if (contactInfo.length == 4) {
                        contact1 = new Contact(contactInfo[0], contactInfo[1], contactInfo[2], Group.fromString(contactInfo[3]));
                    } else {
                        System.out.println("!!! Please, enter Full Name, Phone Number and Group separated by space !!!");
                        continue;
                    }
                    myPhoneContacts.addContact(contact1.getPhone(), contact1);
                    break;
//    2. Добавление пропущенного вызова.
                case 2:
                    System.out.println("Enter the PhoneNumber of the missed call:");
                    input = myScan.nextLine();
                    myMissedCalls.addMissedCall(input);

                    break;
//    3. Вывод всех пропущенных вызовов с указанием фамилии и имени.
//    Если контакта нет в списке контактов, вывести только номер телефона.
                case 3:
                    if (!myMissedCalls.getEntryMissedCalls().isEmpty()) {
                        displayMissedCalls(myMissedCalls, myPhoneContacts);
                    } else {
                        System.out.println("!!! You have no missed calls !!!");
                    }
                    break;
//    4. Очистка пропущенных вызовов.
                case 4:
                    if (!myMissedCalls.getEntryMissedCalls().isEmpty()) {
                        myMissedCalls.clearMissedCalls();
                    } else {
                        System.out.println("!!! You have no missed calls !!!");
                    }

                    break;
//    5. Удаление контакта по имени и фамилии.
                case 5:
                    myPhoneContacts.displayPhoneContacts();
                    if (!myPhoneContacts.getPhoneContacts().isEmpty()) {
                        System.out.println("Enter Contact info: Name Surname(separated by space):");
                        inputContact = myScan.nextLine();
                        contactInfo = inputContact.split(" ");
                        if (contactInfo.length == 2) {
                            myPhoneContacts.deleteContactByFullName(contactInfo[0], contactInfo[1]);
                            System.out.println("Now Phone Book");
                            myPhoneContacts.displayPhoneContacts();
                        } else {
                            System.out.println("!!! Please, enter Name and Surname separated by space !!!");
                            continue;
                        }
                    }
                    break;
            }

        }

    }

    //    Возвращение списка пропущенных вызовов.
    public static void displayMissedCalls(MissedCalls myMissedCalls, PhoneContacts myPhoneContacts) {
        for (Map.Entry<LocalDateTime, String> entryCalls : myMissedCalls.getEntryMissedCalls()) {
            String telNumber = entryCalls.getValue();
            if (myPhoneContacts.getPhoneContacts().containsKey(telNumber)){
                System.out.println(telNumber + " " + myPhoneContacts.getPhoneContacts().get(telNumber).getName()
                        + " " + myPhoneContacts.getPhoneContacts().get(telNumber).getSurname());
            } else {
                System.out.println(telNumber);
            }

        }
    }

}