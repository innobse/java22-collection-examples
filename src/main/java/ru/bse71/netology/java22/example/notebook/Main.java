package ru.bse71.netology.java22.example.notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task 1. Lists
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        fillTasks(notebook);
        print(notebook);
        deleteTasks(notebook);
    }

    private static void fillTasks(Notebook notebook) {
        String taskName = null;
        System.out.println("Введите задачи или \"end\"");
        while(true) {
            taskName = scan.nextLine();
            if ("end".equals(taskName)) break;
            notebook.addTask(taskName);
        }
    }

    private static void deleteTasks(Notebook notebook) {
        System.out.println("Выберите задачу для удаления из списка");
        print(notebook);
        int taskIndex = scan.nextInt();
        notebook.removeTask(taskIndex);

        System.out.println("\nРезультат:");
        print(notebook);

    }

    private static void print(Notebook notebook) {
        System.out.println(notebook);
    }


}
