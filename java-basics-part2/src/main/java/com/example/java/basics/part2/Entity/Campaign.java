package com.example.java.basics.part2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private int budget;
}
