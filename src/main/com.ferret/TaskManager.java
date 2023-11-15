package com.ferret;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description, tasks.size()+1));
    }

    public void markTaskDone(int taskId) {
        if (isValidTaskId(taskId-1)) {
            tasks.get(taskId-1).markDone();
        }
    }

    public void markTaskUndone(int taskId) {
        if (isValidTaskId(taskId-1)) {
            tasks.get(taskId-1).markUndone();
        }
    }

    public String showTasks() {
        if (tasks.isEmpty()) {
            return "No task yet";
        } else {
            String result = "";
            for (Task task : tasks) {
                result+= "\n" +task.toString();
            }
            return result;
        }
    }

    private boolean isValidTaskId(int taskId) {
        return taskId >= 1 && taskId <= tasks.size();
    }
}