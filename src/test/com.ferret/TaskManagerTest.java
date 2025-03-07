package com.ferret;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void addTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        assertEquals(1, taskManager.getTasks().size());
    }

    @Test
    public void removeTask() {
        //to check
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        //taskManager.markTaskUndone(task_id);
        //assertEquals(0, taskManager.getTasks().size());
    }

    @Test
    public void doneTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        taskManager.markTaskDone(1);
        assertEquals(true,taskManager.getTasks().get(0).getStatus());
    }

    @Test
    public void todoTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        assertEquals(false, taskManager.getTasks().get(0).getStatus());
    }

    /*@Test
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
    } */
}