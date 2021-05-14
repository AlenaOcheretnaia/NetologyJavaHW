package ru.netology.phonemissedcalls;

import java.util.*;

public class PhoneContacts {
    private Map<String, Contact> phoneContacts;

    public PhoneContacts() {
        this.phoneContacts = new HashMap<String, Contact>();
    }

    //    Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья).
    public void addContact(String phoneNumber, Contact newContact) {
        phoneContacts.put(phoneNumber, newContact);
    }

    //   Вывод контактов на экрна
    public void displayPhoneContacts() {
        if (phoneContacts.isEmpty()) {
            System.out.println("Phone Book is empty");
        } else {
            System.out.println("Contacts in Phone Book:");
            for (Map.Entry<String, Contact> myBookEntry : phoneContacts.entrySet()) {
                System.out.println(myBookEntry.getValue().toString());
            }
        }
    }
//    Удаление контакта по имени и фамилии.
    public void deleteContactByFullName(String name, String surname) {
        List<String> deletedNumbers = new ArrayList<>();
        for (Map.Entry<String, Contact> myContactsEntry : phoneContacts.entrySet()) {
            if ((myContactsEntry.getValue().getName().equals(name)) && (myContactsEntry.getValue().getSurname().equals(surname))) {
                deletedNumbers.add(myContactsEntry.getKey());
            }
        }
        Iterator it = deletedNumbers.iterator();
        while (it.hasNext()) {
            phoneContacts.remove(it.next());
        }
    }
//    Поиск контакта по номеру.
    public Contact searchContactByPhoneNumber(String phoneNumber) {
        if (phoneContacts.containsKey(phoneNumber)) {
            return phoneContacts.get(phoneNumber);
        } else {
            System.out.println("!!! Such a Phone Number didn't found !!!");
            return null;
        }

    }

//    public Set<Map.Entry<String, Contact>> getphoneContacts(){
//        return phoneContacts.entrySet();
//    }

    public Map<String, Contact> getPhoneContacts() {
        return phoneContacts;
    }
}
