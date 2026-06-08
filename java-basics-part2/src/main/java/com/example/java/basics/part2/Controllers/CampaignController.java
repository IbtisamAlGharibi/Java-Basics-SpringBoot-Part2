package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Campaign;
import com.example.java.basics.part2.Services.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampaignController {
    @Autowired
    CampaignManager campaignManager;

    @PostMapping("/addCampaign")
    public String addCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }

}
