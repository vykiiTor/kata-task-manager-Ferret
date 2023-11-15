package com.ferret;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    String message = "Hello World";
    @Test
    public void testUserCommand(){
        List<Task> tasks = new ArrayList<>();
        assert(tasks.isEmpty());
    }
}