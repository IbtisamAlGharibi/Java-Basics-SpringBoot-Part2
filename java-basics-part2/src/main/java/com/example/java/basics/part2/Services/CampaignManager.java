package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {
    List<Campaign> campaigns = new ArrayList<>();

    public CampaignManager() {
        campaigns.add(new Campaign("C101", "Summer Sale", "Instagram", 500));
        campaigns.add(new Campaign("C102", "Black Friday", "Google Ads", 1000));
        campaigns.add(new Campaign("C103", "Email Promo", "Email", 300));
    }

}
