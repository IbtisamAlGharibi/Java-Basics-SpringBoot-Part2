package com.example.java.basics.part2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "LibraryMember")
public class LibraryMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int memberId;
    private String fullName;
    private String membershipType;

}
