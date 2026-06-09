package com.example.java.basics.part2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "EventRegistration")
public class EventRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int registrationId;
    private String attendeeName;

}
