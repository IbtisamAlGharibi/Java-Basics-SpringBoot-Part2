package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.EventRegistration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class RegistrationService {
    Map<Integer, EventRegistration> registrations = new HashMap<>();

    public RegistrationService() {
        registrations.put(101, new EventRegistration(101, "Ahmed"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "John"));
        registrations.put(104, new EventRegistration(104, "Fatma"));
    }
    public String deleteMultipleByIds(List<Integer> ids) {

        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

        for (Integer id : ids) {
            if (registrations.containsKey(id)) {
                registrations.remove(id);
                deletedIds.add(id);
            } else {
                notFoundIds.add(id);
            }
        }
        return "Total IDs received: " + ids.size()
                + " Number of successfully deleted registrations: " + deletedIds.size()
                + " Deleted IDs: " + deletedIds
                + " IDs not found: " + notFoundIds;
    }
}