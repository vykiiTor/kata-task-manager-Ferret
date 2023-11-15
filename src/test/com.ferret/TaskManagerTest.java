package com.ferret;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    @Test
    public void testUserCommand(){
        List<Task> tasks = new ArrayList<Task>();
        assert(tasks.isEmpty());
    }
}