package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Campaign;
import com.example.java.basics.part2.Entity.Vehicle;
import com.example.java.basics.part2.Services.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CampaignController {
    @Autowired
    CampaignManager campaignManager;

    @PostMapping("/addCampaign")
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }
    @GetMapping("getAll")
    public List<Campaign> getAll() {
        return campaignManager.getAllCampaigns();

    }
}
