package ru.bse71.netology.java22.example.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Contacts {

    private Map<String, Contact> storage = new HashMap<>();

    public void addContact(Contact contact) {
        storage.put(contact.getPhone(), contact);
    }

    public boolean contains(String phone) {
        return storage.containsKey(phone);
    }

    public Contact get(String phone) {
        return storage.get(phone);
    }
}
