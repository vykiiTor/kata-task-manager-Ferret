package com.ferret;

public class Task {
    String description;
    int id;
    boolean status;

    Task(String description, int id) {
        this.description = description;
        this.id = id;
        this.status = false;
    }
    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return status;
    }

    public void markDone() {
        this.status = true;
    }

    public void markUndone() {
        this.status = false;
    }

    @Override
    public String toString() {
        return id + (status ? " [x] " : " [ ] ") + description;
    }
}
