package ru.bse71.netology.java22.example.notebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Notebook {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    public void removeTask(int index) {
        tasks.remove(index-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            sb
                    .append(i+1)
                    .append(". ")
                    .append(tasks.get(i))
                    .append("\n");
        }
        return sb.toString();
    }
}
