package ru.bse71.netology.java22.example.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Phone contacts
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class PhoneContacts {
    private Map<String, List<Contact>> storage = new HashMap<>();

    public boolean addGroup(String groupName) {
        if (storage.containsKey(groupName))
            return false;
        storage.put(groupName, new ArrayList<>());
        return true;
    }

    public boolean addContact(Contact contact, String ... groupNames) {
        for (String groupName : groupNames) {
            if (!storage.containsKey(groupName)) return false;
            storage.get(groupName).add(contact);
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> group : storage.entrySet()) {
            sb
                    .append(group.getKey())
                    .append("\n");

            for (Contact contact : group.getValue()) {
                sb
                        .append("\t")
                        .append(contact)
                        .append("\n");
            }
        }
        return sb.toString();
    }
}
