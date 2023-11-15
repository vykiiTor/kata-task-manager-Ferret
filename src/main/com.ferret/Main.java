package com.ferret;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Task Manager!");
        List<Task> tasks = new ArrayList<Task>();
        Scanner scanner = new Scanner(System.in);
        TaskManager tm = new TaskManager();
        boolean exit = false;
        while (!exit) {
            System.out.print("Enter a string (type 'q' to quit): ");
            String userInput = scanner.nextLine();
            String[] tokens = userInput.split("\\s+");
            switch (tokens[0]) {
                case "+":
                    tm.addTask(tokens[1]);
                    System.out.println(tm.showTasks());
                    break;
                case "x":
                    tm.markTaskDone(Integer.parseInt(tokens[1]));
                    System.out.println(tm.showTasks());
                    break;
                case "o":
                    tm.markTaskUndone(Integer.parseInt(tokens[1]));
                    System.out.println(tm.showTasks());
                    break;
                case "q":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid!");
            }

        }

        System.out.println("Closed Task manager!");
        scanner.close();
    }
}
