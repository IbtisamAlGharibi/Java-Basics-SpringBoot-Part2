package com.example.java.basics.part2;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void initializeMembers(){
      members.add(new LibraryMember(101, "Ahmed", "Standard"));
      members.add(new LibraryMember (102, "Sara", "Premium"));
      members.add(new LibraryMember (103, "John", "Standard"));
    }
    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void displayMembers() {
        for (LibraryMember member : members) {
            System.out.println("ID: " + member.getMemberId() + " Name: " + member.getFullName()
                    + " Type: " + member.getMembershipType());
        }
    }
}
