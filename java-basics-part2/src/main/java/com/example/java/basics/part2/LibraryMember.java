package com.example.java.basics.part2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Getter
@Setter
public class LibraryMember {
    private int memberId;
    private String fullName;
    private String membershipType;

}
