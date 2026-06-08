package com.example.java.basics.part2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class LibraryMember {
    private int memberId;
    private String fullName;
    private String membershipType;

}
