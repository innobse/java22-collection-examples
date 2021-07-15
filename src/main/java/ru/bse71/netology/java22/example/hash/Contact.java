package ru.bse71.netology.java22.example.hash;

/**
 * Description
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Contact {

    private String phone;
    private String name;

    public Contact(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + phone + ")";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
