package ru.bse71.netology.java22.example.tree;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Task 1. TreeSet
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Main {

    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        addContacts(contacts);
        addMissedCalls(missedCalls);
        System.out.println(
                missedCalls.getStringValue(contacts));

        System.out.println("Очищено!");
        missedCalls.clear();

        System.out.println(
                missedCalls.getStringValue(contacts));
    }

    private static void addMissedCalls(MissedCalls missedCalls) {
        Scanner scan = new Scanner(System.in);
        String phone = null;
        while(true) {
            System.out.println("Введите номер пропущенного или \"end\"");
            phone = scan.nextLine();
            if ("end".equals(phone)) break;
            missedCalls.addMissedCall(phone);
        }


    }

    private static void addContacts(Contacts contacts) {
        contacts.addContact(new Contact("+7 777 777 77 77", "Вася"));
        contacts.addContact(new Contact("+7 777 777 77 88", "Петя"));
        contacts.addContact(new Contact("+7 777 777 77 99", "Ваня"));
    }
}
