package com.ferret;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void addTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        assertEquals(1, taskManager.getTasks().size());
    }

    @Test
    void removeTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        taskManager.removeTask(task_id);
        assertEquals(0, taskManager.getTasks().size());
    }

    @Test
    void doneTask() {
        TaskManager taskManager = new TaskManager();
        task_id = taskManager.addTask("Learn Java");
        taskManager.doneTask(task_id);
        assertEquals(TaskStatus.DONE, taskManager.getTasks().get(0).getStatus());
    }

    @Test
    void todoTask() {
        TaskManager taskManager = new TaskManager();
        task_id = taskManager.addTask("Learn Java");
        taskManager.todoTask(task_id);
        assertEquals(TaskStatus.TODO, taskManager.getTasks().get(0).getStatus());
    }

    @Test
    void parseAddCommand() {
        TaskManager taskManager = new TaskManager();
        Command command = taskManager.parseInput("+ Learn Java");
        assertEquals(CommandType.ADD, command.getType());
        assertEquals("Learn Java", command.getDescription());
    }

    @Test
    void parseRemoveCommand() {
        TaskManager taskManager = new TaskManager();
        Command command = taskManager.parseInput("- 1");
        assertEquals(CommandType.REMOVE, command.getType());
        assertEquals(1, command.getId());
    }

    @Test
    void parseCompleteCommand() {
        TaskManager taskManager = new TaskManager();
        Command command = taskManager.parseInput("x 2");
        assertEquals(CommandType.DONE, command.getType());
        assertEquals(2, command.getId());
    }

    @Test
    void parseIncompleteCommand() {
        TaskManager taskManager = new TaskManager();
        Command command = taskManager.parseInput("o 3");
        assertEquals(CommandType.TODO, command.getType());
        assertEquals(3, command.getId());
    }

    @Test
    void parseExitCommand() {
        TaskManager taskManager = new TaskManager();
        Command command = taskManager.parseInput("q");
        assertEquals(CommandType.EXIT, command.getType());
    }

    @Test
    void displayTasksEmpty() {
        TaskManager taskManager = new TaskManager();
        assertEquals("No task yet", taskManager.displayTasks());
    }

    @Test
    void displayTasksWithTasks() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        taskManager.addTask("Write Tests");
        assertEquals("1 [ ] Learn Java\n2 [ ] Write Tests", taskManager.displayTasks());
    }
}