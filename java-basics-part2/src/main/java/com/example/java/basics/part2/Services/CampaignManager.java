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

    public String addCampaign(Campaign campaign) {

        System.out.println("List of campaigns: ");

        for (Campaign campaignList : campaigns) {
            System.out.println(campaignList);
            if (campaignList.getCampaignId().equalsIgnoreCase(campaign.getCampaignId())) {
                return "Campaign already exists";
            }
        }

        campaigns.add(campaign);
        return "Campaign Added successfully";
    }

    public void displayCampaigns() {

        System.out.println("Active Campaigns: \n");
        for (Campaign campaign : campaigns) {
            System.out.println(campaign);
        }
    }

}
