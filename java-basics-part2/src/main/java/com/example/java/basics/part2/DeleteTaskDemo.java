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
        String targetTask =  "Call doctor";

        for (int i =0; i<tasks.size(); i++){
            String firstTask= tasks.get(i);
            if (firstTask.equalsIgnoreCase(targetTask)){
                tasks.remove(targetTask);
                System.out.println("Task Deleted successfully");
                break;
            }else {
                System.out.println("Task not found, no deletion performed");

            }
        }

        System.out.println("Final list: ");
        for (String task : tasks) {
            System.out.println(task);
        }
    }


}
