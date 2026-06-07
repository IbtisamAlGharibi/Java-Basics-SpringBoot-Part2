package com.example.java.basics.part2;

import org.springframework.scheduling.config.Task;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public DeleteTaskDemo() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        for (String task : tasks) {
            System.out.println(task);
        }
    }


}
