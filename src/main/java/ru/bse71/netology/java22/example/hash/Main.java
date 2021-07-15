package ru.bse71.netology.java22.example.hash;

import java.util.Scanner;

/**
 * Description
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Main {
    public static void main(String[] args) {
        PhoneContacts contacts = new PhoneContacts();
        addGroups(contacts);
        addContacts(contacts);
        System.out.println(contacts);
    }

    private static void addContacts(PhoneContacts contacts) {
        contacts.addContact(
                new Contact("+7 777 777 77 77", "Вася"),
                "Семья", "Друзья");
        contacts.addContact(
                new Contact("+7 777 777 77 88", "Петя"),
                "Приятели", "Друзья", "Товарищи");
        contacts.addContact(
                new Contact("+7 777 777 77 99", "Ваня"),
                "Приятели", "Товарищи");
        contacts.addContact(
                new Contact("+7 777 777 77 99", "Спамер"),
                "Друзья", "Спам", "Товарищи", "Приятели", "Семья");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите телефон контакта");
        final String phone = scan.nextLine();
        System.out.println("Введите имя контакта");
        final String name = scan.nextLine();

        final Contact targetContact = new Contact(phone, name);

        System.out.println("Введите группы контаков через ,");
        String groups = scan.nextLine();
        final String[] groupNames = groups.split(",\\s*");
        contacts.addContact(targetContact, groupNames);


    }

    private static void addGroups(PhoneContacts contacts) {
        contacts.addGroup("Семья");
        contacts.addGroup("Друзья");
        contacts.addGroup("Товарищи");
        contacts.addGroup("Приятели");
        contacts.addGroup("Спам");
    }
}
