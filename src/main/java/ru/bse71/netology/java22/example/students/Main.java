package ru.bse71.netology.java22.example.students;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Task 2. Students
 *
 * @author bse71
 * Created on 15.07.2021
 * @since
 */
public class Main {

    private static Set<Student> studentStorage = new HashSet<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Student student;
        while(true) {
            student = getStudent();
            if (student == null) break;
            studentStorage.add(student);
        }

        for (Student tmpStudent : studentStorage) {
            System.out.println(tmpStudent);
        }
    }

    private static Student getStudent() {
        System.out.println("\nВведите id студента");
        final String id = scan.nextLine();

        if ("end".equals(id)) return null;

        System.out.println("Введите имя студента");
        final String name = scan.nextLine();

        System.out.println("Введите группу студента");
        final String group = scan.nextLine();

        return new Student(Integer.parseInt(id), name, group);
    }



}
