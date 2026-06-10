package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Campaign;
import com.example.java.basics.part2.Entity.Employee;
import com.example.java.basics.part2.Inferfaces.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignManager {
    @Autowired
    CampaignRepository campaignRepository;

    public Campaign addCampaign(Campaign newCampaign){
       Campaign campaignToAdd = new Campaign();

       campaignToAdd.setCampaignId(newCampaign.getCampaignId());
       campaignToAdd.setCampaignName(newCampaign.getCampaignName());
       campaignToAdd.setBudget(newCampaign.getBudget());
       campaignToAdd.setPlatform(newCampaign.getPlatform());
       campaignToAdd.setActive(newCampaign.isActive());

        return campaignRepository.save(campaignToAdd);
    }
    public Campaign saveCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public Campaign updateCampaign(String id,String campaignName) {

        Campaign campaign = campaignRepository.findById(id).get();
        if (!campaign.getCampaignName().equals(campaignName)) {
            campaign.setCampaignName(campaignName);
            System.out.println("Updated");
        }
        System.out.println("Already match");
        return campaignRepository.save(campaign);
    }

    public String deleteCampaign(String id) {
        if (!campaignRepository.existsById(id)) {
            return "ID NOT FOUND";
        }
        campaignRepository.deleteById(id);
        return "DELETED";
    }
    public Boolean deleteById(Integer id) {
        Campaign campaign = campaignRepository.getCampaignById(id);
        if (campaign != null) {
            campaign.setActive(false);
            campaignRepository.save(campaign);
            return true;
        } else {
            return false;
        }
    }
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.getAllCampaign();
    }

    public Campaign getById(String id) {
        return campaignRepository.getCampaignById(Integer.valueOf(id));
    }
    public Campaign getByName(String name){
        return campaignRepository.getCampaignByName(name);
    }
    /*
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
        String result = "Campaign Id: " + campaign.getCampaignId()
                + " Campaign Name: " + campaign.getCampaignName()
                + " Added successfully."
                + "\n Updated list of campaigns:\n";

        for (Campaign campaignList : campaigns) {
            result += campaignList;
        }
        return result;
    }

    public void displayCampaigns() {

        System.out.println("Active Campaigns: \n");
        for (Campaign campaign : campaigns) {
            System.out.println(campaign);
        }
    }*/

}
